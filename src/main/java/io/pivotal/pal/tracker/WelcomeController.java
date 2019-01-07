package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  //  @Value("${welcome.message1}")
    private String message;

   public WelcomeController(@Value(value = "${welcome.message}") String message){
       this.message = message;
        
    }


    @GetMapping("/")
    public String sayHello() {

        return message;
    }
}