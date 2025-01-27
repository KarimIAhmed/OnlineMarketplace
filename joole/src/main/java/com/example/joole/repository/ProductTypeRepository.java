package com.example.joole.repository;

import com.example.joole.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductTypeRepository extends JpaRepository<ProductType,Long> {

    Optional<ProductType> findById(long id);
    ProductType findByIdAndType(long id,String type);
}
