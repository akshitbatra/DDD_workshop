import com.thoughtworks.ddd_workshop.domain.Cart;
import com.thoughtworks.ddd_workshop.domain.Item;
import com.thoughtworks.ddd_workshop.domain.Product;

public class Main {
    public static void main(String []args){
        Cart cart = new Cart();
        cart.addItem(new Item(new Product("Ipad Pro"), 1));
        cart.addItem(new Item(new Product("Hero Ink Pen"), 1));
        cart.addItem(new Item(new Product("GM Cricket Bat"), 2));
        cart.removeItem(cart.getItem("Ipad Pro"));
        cart.removeItem(cart.getItem("Hero Ink Pen"));
        cart.addItem(new Item(new Product("Hero Ink Pen"), 1));
        cart.removeItem(cart.getItem("Hero Ink Pen"));
        cart.removedItemsList();
    }
}
