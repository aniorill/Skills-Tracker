package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value={""})
public class SkillsController {


    /*@GetMapping("")
    public String skillsTrackers(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                    "<li>Java</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


    */@GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action= 'form' method= 'post'>" + //submit a request to /hello
                "<input type= 'text' name= 'name'>" +
                "<select name= 'language' id= 'language'>" +
                "<option id= 'Javascript', value='Javascript'> 'Javascript' </option>" +
                "<option id = 'Python, value='Python'> 'Python' </option>" +
                "<option id = 'Java', value='Java'> 'Java' </option>" +
                "</select>" +
                "<input type= 'submit' value= 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    /*public String userProfile(){
        return "<html>" +
                "<body>" +
                "<form action= 'form' method= 'post'>" + //submit a request to /hello
                "<input type= 'text' name= 'name'>" +
                "<select name= 'language' id= 'language'>" +
                "<option value='Javascript'> 'Javascript' </option>" +
                "<option value='Python'> 'Python' </option>" +
                "<option value='Java'> 'Java' </option>" +
                "</select>" +
                "<input type= 'submit' value= 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }*/

}



    /*@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = {"hello"})
    public static String createMessage(@RequestParam String name, @RequestParam String language) {
        if (language.equals("English")) {
            return "Hello " + name + "!";
        }
        if (language.equals("Spanish")) {
            return "Hola " + name + "!";
        }
        if (language.equals("French")) {
            return "Bonjour " + name + "!";
        }
        if (language.equals("Italian")) {
            return "Bongiorno " + name + "!";
        }
        if (language.equals("Korean")) {
            return "안녕하세요 " + name + "!";
        } else{
            return "Language not selected.";
        }*/

