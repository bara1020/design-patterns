package com.yoursoft.creational.prototype.example2;

public abstract class HtmlCode implements Cloneable{

    protected String codeHtml;

    abstract void addCode();

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
