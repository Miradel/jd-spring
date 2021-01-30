package com.cybertek.controller;

import com.cybertek.entity.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    final String URI = "https://jsonplaceholder.typicode.com/users";

    private RestTemplate restTemplate;

    public HomeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public User[] readAllUsers(){

        /*
        restTemplate go to URI and return user class according to the entity
         */

        ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(URI,User[].class);

        return responseEntity.getBody();

    }

    @GetMapping(value = "/{id}")
    public Object readUser(@PathVariable("id") Integer id){
        String URL = URI + "/{id}";
        return restTemplate
                .getForObject(URL,Object.class,id);
    }


    @GetMapping("/test")
    public ResponseEntity<Object> consumePostFromDummyApi(){

        /*
        Before use some api , it need some headers for security
        ResponseEntity will help to handle this
         */

        HttpHeaders heardes = new HttpHeaders();
        heardes.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        heardes.set("app-id","lTE5abbDxdjGplutvTuc");

        HttpEntity<String > entity = new HttpEntity<>(heardes);

        ResponseEntity<Object> response = restTemplate.exchange("https://dummyapi.io/data/api/user?limit=10",
                HttpMethod.GET,entity,Object.class);

        return response;
    }

}
