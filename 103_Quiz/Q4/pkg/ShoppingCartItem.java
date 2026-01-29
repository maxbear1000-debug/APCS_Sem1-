package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int quantity;
    
    public ShoppingCartItem(){
        itemName = "";
        itemCost = 0.0;
        quantity = 0;
        
    }
    
    public ShoppingCartItem(String itemName, double itemCost, int quantity){
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.quantity = quantity; 
    }
    
    public void cartToString(){
        System.out.println("You have " + quantity + " of " + itemName + " for $" + itemCost + "each");
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getTotalCost(){
        return itemCost*quantity; 
    }
    
    public double getTotalWithTax(){
        return (itemCost*quantity)*1.12;
    }
    
    public double quantityToCostCalculator(int x){
        return x*itemCost;
    }
    
    
    public double getItemCost(){
        return itemCost;
        
    }
    
    public boolean compareItemCost(ShoppingCartItem P){
        if(itemCost < P.getItemCost()){
            return false;
        }
        else{
            return false;
        }
    }
    
    public ShoppingCartItem copyCart(){
         
        ShoppingCartItem x  = new ShoppingCartItem(this.itemName, this.itemCost, this.quantity);
        return x; 
    }
    
    
    
    
    
    
}