package se.assignment6.api6.APIBookOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class BookOrderController {
    
    @Autowired
    private BookOrderService bookOrderService;

   
    //GET all orders
    @RequestMapping("/orders")
    public List<Order> getAllOrders () {
        return bookOrderService.getAllOrders();
    }

    //GET a order
    // put string id in place of {id}
    @RequestMapping("/orders/{id}")
    public Order getOrder(@PathVariable String id) {
        return bookOrderService.getOrder(id);
    }
    
    //POST
    @RequestMapping(method=RequestMethod.POST, value="/orders")
    public void addOrder(@RequestBody Order order) {
        bookOrderService.placeOrder(order);
    }

    //DELETE
    @RequestMapping(method=RequestMethod.DELETE, value="/orders/{id}")
    public void deleteOrder(@PathVariable String id) {
        bookOrderService.deleteOrder(id);
    }

}




