package by.home.chaplinskiy.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.home.chaplinskiy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
