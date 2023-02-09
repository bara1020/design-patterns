package com.yoursoft.creational.prototype.example2;

public class OneColumn extends HtmlCode {

    private static String CODE = "<table>" +
            "<tr>" +
            "<td>" +
            "<td>" +
            "</tr>" +
            "</table>";

    public OneColumn() {
        this.codeHtml = CODE;
    }


    @Override
    void addCode() {
        System.out.println(CODE);
    }
}
