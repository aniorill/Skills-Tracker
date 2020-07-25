package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {


    @GetMapping
    public String skillsTrackers() {
        String html = "<html>" +
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
        return html;
    }


    @GetMapping(value = "/form")
    public String skillsForm() {
        String html = "<html>" +
                "<body>" +
                "<form action= '/success' method= 'post'>" + //submit a request to /hello
                "<label name ='name'> Your name here:" +
                "<br/>" +
                "<input type= 'text' name= 'name'>" +
                "<br/>" +
                "<label name ='language'> Your favorite language" +
                "<br/>" +
                "<select name= 'option1' id= 'language'>" +
                "<option id= 'Javascript', value='Javascript', name = 'option1'> Javascript </option>" +
                "<option id = 'Python, value='Python', name= 'option1'> Python </option>" +
                "<option id = 'Java', value='Java', name='option1'> Java </option>" +
                "</select>" +
                "</label>" +
                "<br/>" +
                "<label name ='language'> Your second favorite language" +
                "<br/>" +
                "<select name= 'option2' id= 'language'>" +
                "<option id= 'Javascript', value='Javascript', name = 'option2'> Javascript </option>" +
                "<option id = 'Python, value='Python', name= 'option2'> Python </option>" +
                "<option id = 'Java', value='Java', name='option2'> Java </option>" +
                "</select>" +
                "</label>" +
                "<br/>" +
                "<label name ='language'> Your third favorite language" +
                "<br/>" +
                "<select name= 'option3' id= 'language'>" +
                "<option id= 'Javascript', value='Javascript', name = 'option3'> Javascript </option>" +
                "<option id = 'Python, value='Python', name= 'option3'> Python </option>" +
                "<option id = 'Java', value='Java', name='option3'> Java </option>" +
                "</select>" +
                "</label>" +
                "<br/>" +
                "<input type= 'submit' value= 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

    @PostMapping(value = "/success")
    public String userProfile(@RequestParam String name, @RequestParam String option1, @RequestParam String option2, @RequestParam String option3) {
        String html = "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                //"<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li>" + option1 + "</li>" +
                "<li>" + option2 + "</li>" +
                "<li>" + option3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }
}


