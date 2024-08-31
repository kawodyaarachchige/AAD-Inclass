package org.example.foods;

import org.example.contact.BakeryItem;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Eating Fish Pastry");
    }
}