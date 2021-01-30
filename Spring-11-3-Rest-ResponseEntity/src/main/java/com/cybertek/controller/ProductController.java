package com.cybertek.controller;


import com.cybertek.entity.Product;
import com.cybertek.entity.ResponseWrapper;
import com.cybertek.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
The @RestController annotation was introduced in Spring 4.0 to simplify the creation of RESTful web services.
It is a convenience annotation that combines @Controller and @ResponseBody–which eliminates the need to annotate
 every request handling method of the controller class with the @ResponseBody annotation
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /*
     @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public @ResponseBody Product getProduct(@PathVariable("id") long id){
        return productService.getProduct(id);
    }
     */

    /*
    ResponseEntity represents an HTTP response, including headers, body, and status.
    While @ResponseBody puts the return value into the body of the response, ResponseEntity also allows us
    to add headers and status-code.
    We can set security part in side the header and it become more popular these days
     */

    @GetMapping(value = "{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") long id){
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @RequestMapping
    public ResponseEntity<List<Product>> getProducts(){

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Version","Cybertek.v1");
        responseHeaders.set("operations","Get List");

        return ResponseEntity.
                ok().
                headers(responseHeaders)
                .body(productService.getProducts());
    }


    // Create Products
    /*
     @PostMapping
    public List<Product> createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
     */
    @PostMapping
    public ResponseEntity<List<Product>> createProduct(@RequestBody Product product){
        List<Product> set = productService.createProduct(product);

        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Version","Meradel.V11")
                .header("Operation","Create")
                .body(set);

    }

    // Delete Products
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<List<Product>> deleteProduct(@PathVariable("id") long id){
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Version","Cybertek.v1");
        responseHeaders.set("operations","Delete");
        List<Product> list = productService.delete(id);
        return new ResponseEntity<>(list,responseHeaders,HttpStatus.OK);
    }

    //Update Products  -- need @RequestBody
    @PutMapping(value = "/{id}")
    public ResponseEntity<List<Product>> updateProduct(@PathVariable("id") long id , @RequestBody Product product){

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("Version","Meradel.V12");
        map.add("Operation","Update");

        List<Product> list = productService.updateProduct(id,product);
        return new ResponseEntity<>(list,map,HttpStatus.OK);
    }

    @GetMapping("/read")
    public ResponseEntity<ResponseWrapper> readAllProducts(){
        return ResponseEntity
                .ok(new ResponseWrapper("Products successfully retrieved ",productService.getProducts()));

    }

    /*
    Add custome created response message in the response body
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseWrapper> deleteProduct2(@PathVariable("id") long id){
        return ResponseEntity.ok(new ResponseWrapper("Product Successfully Deleted"));
    }

    @DeleteMapping("/delete2/{id}")
    public ResponseEntity<ResponseWrapper> deleteProduct3(@PathVariable("id") long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ResponseWrapper("Product Successfully Deleted 3"));
    }

}
