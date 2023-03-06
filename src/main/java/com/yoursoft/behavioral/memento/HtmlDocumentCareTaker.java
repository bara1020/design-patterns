package com.yoursoft.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocumentCareTaker {

    private List<HtmlDocument> mementoList = new ArrayList<>();

    public void add(HtmlDocument htmlDocument)
    {
        mementoList.add(htmlDocument);
    }

    public HtmlDocument get(int index)
    {
        return mementoList.get(index);
    }
}
