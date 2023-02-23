package com.yoursoft.structural.flyweight.factory;

import com.yoursoft.structural.flyweight.LargeShirt;
import com.yoursoft.structural.flyweight.MediumShirt;
import com.yoursoft.structural.flyweight.Shirt;
import com.yoursoft.structural.flyweight.SmallShirt;
import com.yoursoft.structural.flyweight.enums.ShirtSize;

import java.util.HashMap;

public class ShirtFactory {

    private static final HashMap<String, Shirt> shirtMap = new HashMap();

    public static Shirt getShirt(ShirtSize shirtSize, String color) {

        String shirtSizeValue = shirtSize.value;
        String key = color.concat("-").concat(shirtSizeValue);
        Shirt shirt = shirtMap.get(key);

        if (shirt != null) {
            return shirt;
        } else {
            shirt = createShirtIntance(shirtSize);
            shirt.setColor(color);
            shirtMap.put(key, shirt);
        }

        return shirt;
    }

    private static Shirt createShirtIntance(ShirtSize shirtSize){
        switch (shirtSize) {
            case SMALL:
                return new SmallShirt();

            case MEDIUM:
                return new MediumShirt();

            case LARGE:
                return new LargeShirt();

            default:
                return new SmallShirt();
        }
    }

}
