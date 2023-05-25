package se.assignment6.api6.APIBookOrder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import se.assignment6.api6.APIBookInventory.BookInventoryController;

@Service
public class BookOrderService {
    
    private List<Order> orders = new ArrayList<>();
    
    //GET order specific
    public Order getOrder(String id) {
        return null;
    }

    //GET all orders
    public List<Order> getAllOrders () {
        return orders;
    }

    //POST 
    public String placeOrder(Order order) {
        return null;
    }


    //DELETE
    public void deleteOrder(String orderID) {
    }

}