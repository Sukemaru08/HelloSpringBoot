package com.example.demo.app.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inquiry")
public class IndexController {

    //Topページ表示
    @GetMapping
    public String form(){
        return "inquiry/index";
    }

    //入力確認画面へ遷移
    @PostMapping("/confirm")
    public String confirm(SampleForm sampleForm){
        return "inquiry/confirm.html";
    }
}
