package ShoppingCart;
import java.util.ArrayList;
import java.util.List;

interface Purchasable{
    void addItem(Item item);
    boolean removeItem(String itemNumber);
    void purchaseItems();
}

abstract class Item{
    String itemNumber;
    String name;
    float price;
}

class Electronics extends Item{
    float power;
    String companyName;
}

class Clothing extends Item{
    String clothMaterial, brand;
}

class Books extends Item{
    String bookName, authorName;
}

class ShoppingCartManager implements Purchasable{
    List<Item> shoppingCart;

    ShoppingCartManager(){
        shoppingCart = new ArrayList<>();
    }

    public void addItem(Item item){
        shoppingCart.add(item);
    }

    @Override
    public boolean removeItem(String itemNumber) {
       if(shoppingCart.size() == 0){
            System.out.println("Shopping cart is empty");
            return false;
       }

       shoppingCart.removeIf(item ->  item.itemNumber == itemNumber);
       return true;
    }

    @Override
    public void purchaseItems() {
        double totalCost = 0;
        if(shoppingCart.size() == 0){
            System.out.println("Shopping cart is empty. Select some items!!");
            return;
        }else{
            for (Item item : shoppingCart) {
                totalCost += item.price;
            }
            System.out.println("Total cost is: " + totalCost);
        }
        return;
    }

    public Item searchByName(String name){
        for (Item item : shoppingCart) {
            if(item.name == name){
                return item;
            }
            else{
                continue;
            }
        }
        System.out.println("Item not present in cart.");
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}
