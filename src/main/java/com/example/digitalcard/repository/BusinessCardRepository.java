package com.example.digitalcard.repository;

import com.example.digitalcard.model.entity.BusinessCard;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusinessCardRepository extends JpaRepository<BusinessCard, Long> {
      Optional<BusinessCard> findByNameAndSurname(String name, String surname);
}
