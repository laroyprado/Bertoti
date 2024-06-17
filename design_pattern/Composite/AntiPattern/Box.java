import java.util.ArrayList;
import java.util.List;

class Box {
    private List<Object> items = new ArrayList<>();
    private double packagingCost;

    public Box(double packagingCost) {
        this.packagingCost = packagingCost;
    }

    public void addItem(Object item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        double total = packagingCost;
        for (Object item : items) {
            if (item instanceof Product) {
                total += ((Product) item).getPrice();
            } else if (item instanceof Box) {
                total += ((Box) item).calculateTotalPrice();
            } else {
                throw new IllegalArgumentException("Unknown item type");
            }
        }
        return total;
    }
}