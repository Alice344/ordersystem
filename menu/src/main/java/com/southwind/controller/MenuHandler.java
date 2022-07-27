package com.southwind.controller;

import com.southwind.entity.Menu;
import com.southwind.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/menu")
@Service
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/index")
    public String index() {
        return "The port of the menu: " + this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return menuRepository.findAll(index, limit);
    }
}

