package com.toolbox.toolboxserver;

import com.toolbox.toolboxserver.configuration.SimpleAuditorAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;

@SpringBootApplication
public class ToolboxServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToolboxServerApplication.class, args);
    }

    @Bean
    public AuditorAware<String> auditorAware () {
        return new SimpleAuditorAware();
    }

}
