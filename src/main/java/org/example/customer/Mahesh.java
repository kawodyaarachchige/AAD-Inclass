package org.example.customer;

import jakarta.annotation.PostConstruct;
import org.example.contact.BakeryItem;
import org.example.customAnnotation.FinalAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {
    private BakeryItem item;

    @Autowired
    @Qualifier("ChickenBun")
    @FinalAnnotation
    public void setItem(BakeryItem item) {
        this.item = item;
    }

    @PostConstruct
    public void init(){
        item.eat();
    }
}
