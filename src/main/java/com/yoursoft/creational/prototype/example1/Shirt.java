package com.yoursoft.creational.prototype.example1;

public abstract class Shirt  implements Cloneable {

    protected String designeName;
    protected String image;

    abstract void addShirt();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
