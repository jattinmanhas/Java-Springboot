package com.springBootProject.FirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name") // we have to add this to call controllers where we want to use that attribute
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService){
        super();
        this.authenticationService = authenticationService;
    }

/*
    ----------- BASICS ------------------
    login?name=Jattin
    use model map to pass paramters to the JSP

    @RequestMapping("login")
    public String login(@RequestParam String name, ModelMap model){
        model.put("name", name);
        System.out.println("Request Param is "+name);
        logger.debug("Request param is {}", name);
        logger.info("Request param at info level is {}", name);
        return "login";
    }
*/

    // GET, POST
    @RequestMapping(value="login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value="login",method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(authenticationService.authenticate(name, password)){
            model.put("name", name);

            return "welcome";
        }
        model.put("errorMessage","Invalid Credentials, Please try again...");
        return "login";
    }
}
