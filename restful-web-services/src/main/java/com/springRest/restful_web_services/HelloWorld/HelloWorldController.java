package com.springRest.restful_web_services.HelloWorld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

// REST API
@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource){
        this.messageSource = messageSource;
    }
    // link ->  /hello-world
    // return -> "Hello World"

//    @RequestMapping(method = RequestMethod.GET, path = "hello-world")
    @GetMapping(path = "hello-world")
    public String helloWorld(){
        return "Hello World Using Get Mapping";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    // PATH PARAMTERS
    // /users/{id}/todo/{id}
    // /hello-world/path-variable/{name}

    @GetMapping(path = "hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean("Hello World " + name);
    }

    @GetMapping(path = "hello-world-internationalized")
    public String helloWorldInternationalized(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
    }
}
