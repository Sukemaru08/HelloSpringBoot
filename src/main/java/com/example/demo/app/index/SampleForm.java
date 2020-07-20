package com.example.demo.app.index;

import lombok.Data;

@Data
public class SampleForm {

    private String name;
    private String email;
    private String contents;

    //それぞれを引数とするコンストラクタ
    public SampleForm(String Name, String Email, String Contents){
        this.name = Name;
        this.email = Email;
        this.contents = Contents;
    }

    //引数なしのコンストラクタ
    public SampleForm(){
        this("","","");
    }

    //getter, setterは@Dataで自動生成
}
