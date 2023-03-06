package com.yoursoft.behavioral.memento;

public class HtmlDocument {

    private String title;
    private String headerHtml;
    private String bodyHtml;
    private String footerHtml;

    public HtmlDocument(String title, String headerHtml, String bodyHtml,
            String footerHtml) {
        this.title = title;
        this.headerHtml = headerHtml;
        this.bodyHtml = bodyHtml;
        this.footerHtml = footerHtml;
    }

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
}
