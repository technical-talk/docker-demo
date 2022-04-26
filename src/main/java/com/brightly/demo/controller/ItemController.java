package com.brightly.demo.controller;

import com.brightly.demo.model.Item;
import com.brightly.demo.service.ItemService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(value = "/save")
    public void saveUser(@RequestBody Item item){
        System.out.println("item Name: " + item.getItemName());
        itemService.saveItem(item);
    }

    @GetMapping(value = "/all")
    public List<Item> getItems() {
        return itemService.getItems();
    }
}
