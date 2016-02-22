package ru.sianie22.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author: Denis Grigorichev
 * Created at: 13.02.16
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "home";
    }
}
