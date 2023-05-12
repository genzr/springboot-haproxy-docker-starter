package learning.devlops.springbootapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // http://localhost:8080/api
public class HelloWorldController {

    String instanceID = "";

    public HelloWorldController(@Value("${INSTANCE_ID}") String instanceID) {
        this.instanceID = instanceID;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World from instance " + instanceID + "!";
    }

}
