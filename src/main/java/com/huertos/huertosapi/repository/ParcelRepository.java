package com.huertos.huertosapi.repository;

import com.huertos.huertosapi.model.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRepository extends JpaRepository<Parcel, Long> {
    // Hereda automáticamente métodos CRUD como save(), findById(), findAll(), deleteById(), etc.
}