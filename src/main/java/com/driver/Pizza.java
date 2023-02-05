package com.driver;



public class Pizza {
    
    private int Price;
    private Boolean isVeg;
    private String Bill;
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
            Price = 300;
            ExtraTopping = 70;
        } else {
            Price = 400;
            extraTopping = 120;
        }
        Bill = "Base Price Of The Pizza: " + Price + "\n";
    }

    public int getPrice(){
        
        return this.Price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded) {
            Price += extraCheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isToppingsAdded) {
            Price += extraTopping;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
         if (!isPaperBagAdded) {
            Price += PaperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!isBillGenerated) {
            isBillGenerated = true;

            if (isCheeseAdded)
                Bill += "Extra Cheese Added: " + extraCheese + "\n";

            if (isToppingsAdded)
                Bill += "Extra Toppings Added: " + extraTopping + "\n";

            if (isPaperBagAdded)
                Bill += "PaperBag Added: " + PaperBag + "\n";


            Bill += "Total Price: " + Price + "\n";


        }
        return this.Bill;
        
    }
}
