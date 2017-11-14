package com.pujan1.api.controller;

import java.util.*;
import com.pujan1.api.entity.user;
import org.springframework.web.bind.annotation.*;
import com.pujan1.api.service.userService;


@RestController
@RequestMapping(value = "users")
public class userController {

    private userService service;


    public userController(userService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<user> findAll(){

        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public user findOne(@PathVariable("id") String id){

        return service.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public user create(@RequestBody user user){

        return service.create(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public user update(@PathVariable("id") String id, @RequestBody user user){

        return service.update(id, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable("id") String id){

        service.delete(id);
    }

}
