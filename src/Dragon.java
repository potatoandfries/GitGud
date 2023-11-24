import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dragon implements Damagable {

    private int hp = 10000;
    String element;


    // Method to get a random element
    private String getRandomElement() {
        List<String> elements = new ArrayList<>();
        elements.add("Infernal");
        elements.add("Chemtech");
        elements.add("Ocean");
        elements.add("Mountain");
        elements.add("Hextech");
        elements.add("Cloud");

        Random random = new Random();
        return elements.get(random.nextInt(elements.size()));
    }

    public Dragon() {

    }

    public Dragon(int hp) {
        this.hp = hp;
9
    }

    public Dragon(String element) {
        this.element = getRandomElement();
    }

    public Dragon(String element, int hp) {
        this.element = getRandomElement();
        this.hp = hp;
    }

    public void setHp(int hp) 
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public int takedamage(int damage) {
        hp -= damage;
        // Check if HP is below 0, and if so, set it to 0
        if (hp < 0) {
            hp = 0;
        }
        return hp;
    }

    
}