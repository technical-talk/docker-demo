package com.brightly.demo.service;

import com.brightly.demo.model.Item;
import com.brightly.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void saveItem(Item item){
        itemRepository.save(item);
    }


    public List<Item> getItems(){
        return itemRepository.findAll();
    }
}
