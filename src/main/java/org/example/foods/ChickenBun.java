package org.example.foods;

import org.example.contact.BakeryItem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("ChickenBun")
public class ChickenBun implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Eating chicken bun");
    }
}
