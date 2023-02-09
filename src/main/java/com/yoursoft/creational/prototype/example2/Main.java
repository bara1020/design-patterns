package com.yoursoft.creational.prototype.example2;

public class Main {

    public static void main(String[] args) {
        EmailCode.getHtmlCode("oneColumn").addCode();
        EmailCode.getHtmlCode("twoColumn").addCode();
        EmailCode.getHtmlCode("twoColumn").addCode();
        EmailCode.getHtmlCode("oneColumn").addCode();


    }
}
