package com.example.demo.app.index;

import lombok.Data;

@Data
public class SampleForm {
    private String input;
    private boolean checkbox1;
    private boolean checkbox2;
    private int radio;
    private int select;
    public SampleForm() {}
}
