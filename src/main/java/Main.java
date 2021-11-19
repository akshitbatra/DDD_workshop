import com.thoughtworks.ddd_workshop.domain.Cart;
import com.thoughtworks.ddd_workshop.domain.Item;
import com.thoughtworks.ddd_workshop.domain.Price;
import com.thoughtworks.ddd_workshop.domain.Product;
import com.thoughtworks.ddd_workshop.domain.bank.Address;
import com.thoughtworks.ddd_workshop.domain.bank.Customer;
import com.thoughtworks.ddd_workshop.domain.domain_service.CompetitorBasedPricing;

import java.util.HashMap;

public class Main {

    public void cart(){
        CompetitorBasedPricing competitorBasedPricing = new CompetitorBasedPricing();
        Cart cart = new Cart();
        cart.addItem(new Item(new Product("Ipad Pro", new Price(10000, "INR")), 1));
        cart.addItem(new Item(new Product("Hero Ink Pen", new Price(10, "INR")), 1));
        cart.addItem(new Item(new Product("GM Cricket Bat", new Price(1000, "INR")), 2));
        cart.removeItem(cart.getItem("Ipad Pro"));
        cart.removeItem(cart.getItem("Hero Ink Pen"));
        cart.addItem(new Item(new Product("Hero Ink Pen", new Price(10000, "INR")), 1));
        cart.removeItem(cart.getItem("Hero Ink Pen"));
        cart.removedItemsList();


        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        Item item1 = new Item(new Product("Ipad", new Price(10000, "INR")), 1);
        Item item2 = new Item(new Product("Ipad", new Price(10000, "INR")), 1);
        cart1.addItem(item1);
        cart2.addItem(item1);

        System.out.println("Are the cart equal? " + cart1.equals(cart2));

        cart.addItem(new Item(new Product("Ipad Pro",
                new Price(competitorBasedPricing.calculateDiscountPrice(10, "Ipad Pro"), "INR")
        ), 3));
    }
    public static void main(String []args){
        Customer customer = new Customer();
        customer.updateAddress(new Address("Delhi"));
        customer.updateAddress(new Address("Hyderabad"));
    }
}
