package com.technical.talk.demo.controller;

import com.technical.talk.demo.model.Item;
import com.technical.talk.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
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
