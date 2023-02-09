package com.yoursoft.creational.prototype.example2;

import java.util.HashMap;
import java.util.Map;

public class EmailCode {

    private static Map<String, HtmlCode> emailMap = new HashMap<String, HtmlCode>();

    static
    {
        emailMap.put("oneColumn", new OneColumn());
        emailMap.put("twoColumn", new TwoColumn());
    }

    public static HtmlCode getHtmlCode(String htmlType)
    {
        return (HtmlCode) emailMap.get(htmlType).clone();
    }
}
