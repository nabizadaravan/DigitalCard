package com.example.digitalcard.controller;


import com.example.digitalcard.model.entity.BusinessCard;
import com.example.digitalcard.repository.BusinessCardRepository;
import com.example.digitalcard.service.BusinessCardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/digital")
public class BusinessCardController {

      private final BusinessCardService businessCardService;

    public BusinessCardController(BusinessCardService businessCardService) {
        this.businessCardService = businessCardService;
    }


    @GetMapping("/{name}/{surname}")
    public BusinessCard getCard(@PathVariable String name, @PathVariable String surname) {
        return businessCardService.findByNameAndSurname(name, surname);
    }


    @GetMapping("/test")
    public String test(){
        return "Service is working";
    }
}
