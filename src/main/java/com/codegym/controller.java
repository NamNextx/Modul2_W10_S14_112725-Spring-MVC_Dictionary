package com.codegym;

import com.codegym.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @GetMapping("/home")
    public String requestHome() {
        return "home";
    }
    @PostMapping("/home")
    public String result(@RequestParam String inputValune, Model myModel){
        DictionaryService dictionaryService=new DictionaryService();
        String result=dictionaryService.findData(inputValune);
        myModel.addAttribute("result",result);
        return "home";
    }
}

