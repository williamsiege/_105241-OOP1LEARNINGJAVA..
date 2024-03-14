package com.homework;
public class InvoicePay implements PayableInterface {
    private String itemName;
    private int quantity;
    private double pricePerItem;

    public InvoicePay(String itemName,int quantity, double pricePerItem){
        this.itemName=itemName;
        this.quantity=quantity;
        this.pricePerItem=pricePerItem;
    }
    @Override
    public double getPayableAmount() {
        return (quantity*pricePerItem);
    }
    public String getItemName() {
        return itemName;
    }

    @Override
    public void showDetails() {
        System.out.println("Item Name is: "+getItemName());
        System.out.println("Items Sold: "+getPayableAmount());
    }
}
