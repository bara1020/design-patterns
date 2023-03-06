package com.yoursoft.behavioral.memento;

public class HtmlDocumentOriginator {

    private String title;
    private String headerHtml;
    private String bodyHtml;
    private String footerHtml;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeaderHtml() {
        return headerHtml;
    }

    public void setHeaderHtml(String headerHtml) {
        this.headerHtml = headerHtml;
    }

    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public String getFooterHtml() {
        return footerHtml;
    }

    public void setFooterHtml(String footerHtml) {
        this.footerHtml = footerHtml;
    }

    public HtmlDocument saveStateToMemento()
    {
        return new HtmlDocument(title, headerHtml, bodyHtml, footerHtml);
    }

    public void getStateFromMemento(HtmlDocument memento)
    {
        this.title = memento.getTitle();
        this.headerHtml = memento.getHeaderHtml();
        this.bodyHtml = memento.getBodyHtml();
        this.footerHtml = memento.getTitle();
        this.title = memento.getFooterHtml();

    }

    @Override
    public String toString() {
        return "HtmlDocumentOriginator{" + "title='" + title + '\'' + ", headerHtml='" + headerHtml + '\'' + ", bodyHtml='" + bodyHtml + '\'' + ", footerHtml='" + footerHtml + '\'' + '}';
    }
}
