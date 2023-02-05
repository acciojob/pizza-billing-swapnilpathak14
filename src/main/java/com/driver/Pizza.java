package com.driver;



public class Pizza {
    
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;

    private int extraCheese;
    private int extraTopping;
    private int PaperBag;

    

    public Pizza(Boolean isVeg){
        
        isBillGenerated = false;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;
        
        this.isVeg = isVeg;
        // your code goes here
        
        ExtraCheese = 80;
        PaperBag = 20;
        
        if (this.isVeg) {
            price = 300;
            ExtraTopping = 70;
        } else {
            price = 400;
            ExtraTopping = 120;
        }
        bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){
        
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded) {
            price += extraCheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isToppingsAdded) {
            price += ExtraTopping;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
         if (!isPaperBagAdded) {
            price += PaperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!isBillGenerated) {
            isBillGenerated = true;

            if (isCheeseAdded)
                bill += "Extra Cheese Added: " + extraCheese + "\n";

            if (isToppingsAdded)
                bill += "Extra Toppings Added: " + ExtraTopping + "\n";

            if (isPaperBagAdded)
                bill += "PaperBag Added: " + PaperBag + "\n";


            bill += "Total Price: " + price + "\n";


        }
        return this.bill;
        
    }
}
