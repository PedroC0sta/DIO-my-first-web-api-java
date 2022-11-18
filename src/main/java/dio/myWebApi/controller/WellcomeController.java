package dio.myWebApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {
    @GetMapping
    public String wellcome(){
        return "Wellcome to My String Boot Web API";
    }
}
