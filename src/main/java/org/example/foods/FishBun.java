package org.example.foods;

import org.example.contact.BakeryItem;
import org.springframework.stereotype.Component;

@Component
public class FishBun  implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Eating Fish Bun");
    }
}
