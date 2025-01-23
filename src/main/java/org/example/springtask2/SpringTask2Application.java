package org.example.springtask2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Products for final task", version = "1.0", description = "Products information"))
public class SpringTask2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringTask2Application.class, args);
    }

}
