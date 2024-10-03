
package com.springBootProject.FirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // "say-hello" => "Hello! What are you learning today?"
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>My first html page with body</h1>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    // say-hello.jsp => say-hello-jsp
    @RequestMapping("say-hello-jsp")
//    @ResponseBody
    // src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    public String sayHelloJsp(){
        return "sayHello";
    }
}
