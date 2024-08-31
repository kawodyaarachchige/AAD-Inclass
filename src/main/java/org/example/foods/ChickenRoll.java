package org.example.foods;

import org.example.contact.BakeryItem;
import org.example.customAnnotation.FinalAnnotation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("ChickenRoll")
@FinalAnnotation
public class ChickenRoll implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Eating chicken roll");
    }
}
