package se.assignment6.api6.APIBookInventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BookInventoryService {

    private Map<String, Inventory> inventory;
    public static int sumOfAllInventory;
    

    public BookInventoryService () {
        inventory = new HashMap<String, Inventory>() {{
            put("B001", new Inventory("B001", "To Kill a Mockingbird", 10));
            put("B002", new Inventory("B002","Animal Farm", 4));
            put("B003", new Inventory("B003", "The Great Gatsby", 8));
        }};
    }


    //GET specific
    public Inventory getInventory(String id) {
        return null;
    }
    
    //GET all
    public List<Inventory> getAllInventory() {
        return null;
    }

    //POST
    public String createInventory(Inventory inventoryEntry) {
        return null;
    }

    //PUT
    public void updateInventory (String id, int newQuantity) {
    }

    //DELETE
    public String deleteInventory(String id) {
        return null;
    }
}
