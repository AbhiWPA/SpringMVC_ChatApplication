package lk.epic.config;

import lk.epic.controller.ServerController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan (basePackageClasses = {ServerController.class})
@EnableWebMvc
public class WebAppConfig {
}
