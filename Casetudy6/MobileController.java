package com.spring.Controller;

import java.util.List;

import com.spring.entity.Mobile;
import com.spring.service.MobileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mobile") //our url look like http://localhost:8624/mobile ////we send this url to postman to connect with spring boot //we can use any name here but for understanding we use mobile
public class MobileController {
    @Autowired
    MobileService service;
    @PostMapping("/addMobile") ////http://localhost:8624/mobile/addMobile  //(we can use @request mapping but every time we have to provide get post delete remove mean add ,delete,update etc internally)
    public Mobile addMobile (@RequestBody Mobile mob)  // request body convert json format (url) to object automaticall because spring undersAND ONLY OBJECT
    {
        return service.addMobile(mob);
    }
    @PutMapping("/updatMobile") ////http://localhost:8624/mobile/updateMobile  //(we can use @request mapping but every time we have to provide get post delete remove mean add ,delete,update etc internally)
    public Mobile updateMobile (@RequestBody Mobile mob)
    {
        return service.updateMobile(mob);
    }
    @GetMapping("/getMobile/{mid}") ////http://localhost:8624/mobile/getMobile/mid  //(we can use @request mapping but every time we have to provide get post delete remove mean add ,delete,update etc internally)
    public Mobile getMobile (@PathVariable int mobId)
    {
        return service.getMobile(mobId);
    }
    @GetMapping("/getAllMobiles/{mid}") ////http://localhost:8624/mobile/getAllMobile  //(we can use @request mapping but every time we have to provide get post delete remove mean add ,delete,update etc internally)
    public List<Mobile> getAllMobiles()
    {
        return service.getAllMobiles();
    }
    @DeleteMapping("/deleteMobile/{mid}") ////http://localhost:8624/mobile/deleteMobile/mid  //(we can use @request mapping but every time we have to provide get post delete remove mean add ,delete,update etc internally)
    public String deleteMobile (@PathVariable int mobId)
    {
        return service.deleteMobile(mobId);
    }
}
