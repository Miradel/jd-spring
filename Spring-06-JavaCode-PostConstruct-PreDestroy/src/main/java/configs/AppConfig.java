package configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("services") // Scan from this package
@PropertySource("classpath:application.properties")  // Get Values from property file
public class AppConfig {




}
