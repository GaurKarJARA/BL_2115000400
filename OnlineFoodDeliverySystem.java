import java.util.ArrayList;
import java.util.List;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
        public double getPrice() {
            return price;
        }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private static final double DISCOUNT_RATE = 0.05;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    public String getDiscountDetails() {
        return "Veg Discount will be: " + applyDiscount();
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 20;
    private static final double DISCOUNT_RATE = 0.03;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() + ADDITIONAL_CHARGE) * getQuantity();
    }
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount will be: " + applyDiscount();
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("maharaja veg ", 240, 1));
        order.add(new NonVegItem("double cheese", 240, 1));

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
        }
    }
}