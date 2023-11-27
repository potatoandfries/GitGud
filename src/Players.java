
import java.util.List; 
import java.util.ArrayList; 

public class Players implements Damagable{

    private int hp = 2000;
    private List<String> items = new ArrayList<>();//allow for a list for players to add or purchase items.

    @Override
    public int takedamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
        return hp;
    }
    //constructor
    public Players(int hp){
        this.hp = hp;
    }

    public Players(){
        
    }
    //e/of constructor

    
    public int getHp() {//gettters 
        return hp;
    }
    public void setHp(int hp) {//and setters
        this.hp = hp;
    }
    
    

    // Item management methods

    // Method to buy an item
    public void buyItem(String item) {
        items.add(item);
        System.out.println("Item purchased: " + item);
    }

    // Method to sell an item
    public void sellItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Item sold: " + item);
        } else {
            System.out.println("Player does not have the item: " + item);
        }
    }

    // Method to display the player's items
    public void displayItems() {
        System.out.println("Player's items: " + items);
    }
}
