public class Main {
    public static void main(String[] args) {
        Players player1 = new Players(1000);

        // Buy and display items
        player1.buyItem("Sword");
        player1.buyItem("Shield");
        player1.displayItems();

        // Sell and display items
        player1.sellItem("Sword");
        player1.displayItems();
    }
}