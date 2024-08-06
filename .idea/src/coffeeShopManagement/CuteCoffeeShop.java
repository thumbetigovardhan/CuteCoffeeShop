package coffeeShopManagement;

public class CuteCoffeeShop {

    public static void orderCoffee() {
        System.out.println("Order a default coffee.");
    }
    public static void orderCoffee(String type) {
        System.out.println("Order a " + type + "coffee.");
    }
    public static String orderCookie() {
        return "Order a default cookie.";
    }
    public static String orderCookie(String type) {
        return "Ordered a " + type + "cookie.";
    }

    public static void main(String[] args) {
        orderCoffee();
        orderCoffee("Espresso");
        String cookieOrder1 = orderCookie();
        System.out.println(cookieOrder1);
        String cookieOrder2 = orderCookie("Chocolate Chip");
        System.out.println(cookieOrder2);

    }
}
