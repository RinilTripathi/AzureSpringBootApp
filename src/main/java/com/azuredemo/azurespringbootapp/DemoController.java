package com.azuredemo.azurespringbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping
    public String helloWord(){
        return "Hello Azure! Congrats your App Deployed Successfully";
    }

    @RequestMapping("/goodBye")
        public String goodBye() {
            return "Saying GoodBye from Azure, TC";
        }
}
