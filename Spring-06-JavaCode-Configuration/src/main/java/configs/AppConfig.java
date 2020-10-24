package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import services.Api;
import services.Html;


@Configuration
@ComponentScan("services") // Scan from this package
@PropertySource("classpath:application.properties")  // Get Values from property file
public class AppConfig {

    @Bean
    public Api api(){
        return new Api();
    }

    @Bean
    public Html html(){
        return new Html(api());
    }


}
