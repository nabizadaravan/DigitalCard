package com.example.digitalcard.service;


import com.example.digitalcard.model.entity.BusinessCard;
import com.example.digitalcard.repository.BusinessCardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class BusinessCardService {
    private final BusinessCardRepository businessCardRepository;

    public BusinessCardService(BusinessCardRepository businessCardRepository) {
        this.businessCardRepository = businessCardRepository;
    }


    public BusinessCard findByNameAndSurname(String name, String surname){
        return businessCardRepository.findByNameAndSurname(name,surname)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Istifadeci tapilmadi"));


    }
    }


