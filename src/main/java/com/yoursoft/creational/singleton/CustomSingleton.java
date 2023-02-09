package com.yoursoft.creational.singleton;

public class CustomSingleton {

    //Volatile keyword is used to modify the value of a variable by different threads
    private static volatile CustomSingleton obj  = null;

    CustomSingleton() {}

    public static CustomSingleton getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (CustomSingleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null) {
                    System.out.println("New Singleton instance");
                    obj = new CustomSingleton();
                }
            }
        }
        return obj;
    }
}
