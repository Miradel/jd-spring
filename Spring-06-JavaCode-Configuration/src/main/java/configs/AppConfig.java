package configs;

import interfaces.ExtraSesstions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import services.Api;
import services.Html;
import services.OfficeHourse;


@Configuration
@ComponentScan("services") // Scan from this package
@PropertySource("classpath:application.properties")  // Get Values from property file
public class AppConfig {


    /*
     @Bean VS @Component
     @Bean is same with @Component, both will generate the bean ,
     but @Component is in the class level, while @Bean is the Method level.

     Some time when we use some third party application , and want to get a bean from that class
     @Bean is the proper options
     */

    @Bean
    public Api api(){
        return new Api(extraSesstions());
    }

    @Bean
    public Html html(){
        return new Html(api());
    }

    @Bean
    public ExtraSesstions extraSesstions(){
        return new OfficeHourse() ;
    }


}
