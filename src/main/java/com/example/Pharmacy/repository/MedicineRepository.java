package com.example.Pharmacy.repository;

import com.example.Pharmacy.model.Medicine;
import com.sun.corba.se.spi.ior.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends MongoRepository<Medicine, ObjectId> {
}
