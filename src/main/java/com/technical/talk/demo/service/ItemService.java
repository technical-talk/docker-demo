package com.technical.talk.demo.service;

import com.technical.talk.demo.model.Item;
import com.technical.talk.demo.repository.ItemRepository;
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
