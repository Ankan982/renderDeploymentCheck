package com.example.demo;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfiguration {

   @Bean
   public OpenAPI defineOpenApi() {
       //Server server = new Server();
       //server.setUrl("http://localhost:5050");
       //server.setDescription("Development");

       Contact myContact = new Contact();
       myContact.setName("Ankan Das");
       myContact.setEmail("adas8682@gmail.com");

       Info information = new Info()
               .title("Demo App")
               .version("1.0")
               .description("This API exposes endpoints to manage Demo Project.")
               .contact(myContact);
       return new OpenAPI().info(information);
   }
}