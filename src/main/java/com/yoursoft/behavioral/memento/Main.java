package com.yoursoft.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        HtmlDocumentOriginator originator = new HtmlDocumentOriginator();
        HtmlDocumentCareTaker careTaker = new HtmlDocumentCareTaker();

        originator.setTitle("Html title 1");
        originator.setBodyHtml("<body>1</body>");
        originator.setFooterHtml("<footer>1</footer>");
        originator.setHeaderHtml("<header>1</header>");

        careTaker.add(originator.saveStateToMemento());

        originator.setTitle("Html title 2");
        originator.setBodyHtml("<body>2</body>");
        originator.setFooterHtml("<footer>2</footer>");
        originator.setHeaderHtml("<header>2</header>");

        careTaker.add(originator.saveStateToMemento());

        originator.setTitle("Html title 3");
        originator.setBodyHtml("<body>3</body>");
        originator.setFooterHtml("<footer>3</footer>");
        originator.setHeaderHtml("<header>3</header>");

        careTaker.add(originator.saveStateToMemento());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First html saved: " + originator.toString());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second html saved: " + originator.toString());

        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Third html saved: " + originator.toString());

    }
}
