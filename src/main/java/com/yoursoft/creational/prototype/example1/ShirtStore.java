package com.yoursoft.creational.prototype.example1;

import java.util.HashMap;
import java.util.Map;

public class ShirtStore {

    private static Map<String, Shirt> colorMap = new HashMap<String, Shirt>();



    static
    {
        colorMap.put("classicShirt", new ClassicShirt());
        colorMap.put("sportShirt", new SportShirt());
    }

    public static Shirt getShirt(String shirtType)
    {
        return (Shirt) colorMap.get(shirtType).clone();
    }
}
