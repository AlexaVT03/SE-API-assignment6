package se.assignment6.api6.APIBookInventory;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class BookInventoryController {
    
    @Autowired
    private BookInventoryService bookInventoryService;

    
    //GET all inventory
    @RequestMapping("/inventory")
    public List<Inventory> getAllInventory () {
        return bookInventoryService.getAllInventory();
    }

    //GET a topic
    // put string id in place of {id}
    @RequestMapping("/inventory/{id}")
    public Inventory getInventory(@PathVariable String id) {
        return bookInventoryService.getInventory(id);
    }
    
    //POST
    @RequestMapping(method=RequestMethod.POST, value="/inventory")
    public void addInventory(@RequestBody Inventory inventory) {
        bookInventoryService.createInventory(inventory);
    }

    //UPDATE
    @RequestMapping(method=RequestMethod.PUT, value="/inventory/{id}/{newQuantity}")
    public void updateInventory(@PathVariable String id, @PathVariable int newQuantity) {
        bookInventoryService.updateInventory(id, newQuantity);
    }

    //DELETE
    @RequestMapping(method=RequestMethod.DELETE, value="/inventory/{id}")
    public void deleteInventory(@PathVariable String id) {
        bookInventoryService.deleteInventory(id);
    }

}



