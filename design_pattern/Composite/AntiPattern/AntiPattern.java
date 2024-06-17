
public class AntiPattern {
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 15.0);
        Product product3 = new Product("Product 3", 20.0);

        Box box1 = new Box(5.0); // Custo de embalagem é 5
        box1.addItem(product1);
        box1.addItem(product2);

        Box box2 = new Box(3.0); // Custo de embalagem é 3
        box2.addItem(product3);
        box2.addItem(box1);

        System.out.println("Total price of box1: " + box1.calculateTotalPrice());
        System.out.println("Total price of box2: " + box2.calculateTotalPrice());
    }
}