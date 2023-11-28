package com.example.demo;

import com.example.demo.dao.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;


import com.example.demo.dao.model.ItemRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


 @Autowired
  ItemRepository itemRepository;

  @Override
  public void run(String... args) throws Exception {
    itemRepository.save(new Item(null, "Mac Airbook Pro"));
    itemRepository.save(new Item(null, "IPhone 15"));
  }

}