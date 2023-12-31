import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dragon implements Damagable {

    private int hp = 10000;
    private String element;

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

    // these are all constructors
    public Dragon() {
        this.element = getRandomElement();
    }

    public Dragon(int hp) {
        this.hp = hp;
    }

    public Dragon(String element) {
        this.element = element;
    }

    public Dragon(String element, int hp) {
        this.element = element;
        this.hp = hp;
    }
    // these are all constructors >

    // getters and setters
    public void setHp(int hp) {
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