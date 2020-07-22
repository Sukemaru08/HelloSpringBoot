package com.example.demo.app.index;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SampleForm {

    @NotBlank(message = "お名前を入力してください")
    @Size(max = 65, message = "お名前は65文字以内で入力してください")
    private String name;

    @NotBlank(message = "メールアドレスを入力してください")
    @Size(max = 128, message = "メールアドレスは128文字以内で入力してください")
    @Email
    private String email;

    @NotBlank(message = "お問い合わせ内容を入力してください")
    @Size(max = 500, message = "お問い合わせ内容は500文字以内で入力してください")
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
