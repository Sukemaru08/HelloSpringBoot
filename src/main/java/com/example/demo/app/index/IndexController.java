package com.example.demo.app.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    
    @GetMapping
    public String index(Model model){
        SampleForm sampleForm = new SampleForm();
        sampleForm.setInput("This is input value");
        sampleForm.setCheckbox1(true);
        sampleForm.setCheckbox2(false);
        sampleForm.setRadio(2);
        sampleForm.setSelect(1);

        model.addAttribute("sampleForm", sampleForm);
        return "index";
    }
}
