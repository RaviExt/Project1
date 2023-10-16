package com.tourist.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourist.service.entity.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Long>{

}
