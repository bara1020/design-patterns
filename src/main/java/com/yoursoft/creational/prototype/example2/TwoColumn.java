package com.yoursoft.creational.prototype.example2;

public class TwoColumn extends HtmlCode {

    private static String CODE = "<table>" +
            "<tr>" +
            "<td>" +
            "<td>" +
            "<td>" +
            "<td>" +
            "</tr>" +
            "</table>";

    public TwoColumn() {
        this.codeHtml = CODE;
    }

    @Override
    void addCode() {
        System.out.println(CODE);
    }
}
