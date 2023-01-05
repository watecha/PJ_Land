package idv.demo.watepay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class FirstBootController {

    //@RequestMapping("/")
    public String helloPage(){
        return "Hello! Spring Boot watepay 123!";
    }
}