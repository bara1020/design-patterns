package com.yoursoft.creational.factorymethod.example2.model;

public class Campaign {
    private int invoiceNumber;
    private double tax;

    private double discount;

    public Campaign(int invoiceNumber, double tax) {
        this.invoiceNumber = invoiceNumber;
        this.tax = tax;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "invoiceNumber=" + invoiceNumber +
                ", tax=" + tax +
                ", discount=" + discount +
                '}';
    }
}
