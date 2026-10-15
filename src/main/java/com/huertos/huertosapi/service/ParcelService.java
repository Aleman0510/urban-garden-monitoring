package com.huertos.huertosapi.service;

import com.huertos.huertosapi.model.Parcel;
import com.huertos.huertosapi.repository.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParcelService {

    @Autowired
    private ParcelRepository parcelRepository;

    public List<Parcel> findAll() {
        return parcelRepository.findAll();
    }

    public Optional<Parcel> findById(Long id) {
        return parcelRepository.findById(id);
    }

    public Parcel save(Parcel parcel) {
        return parcelRepository.save(parcel);
    }

    public void deleteById(Long id) {
        parcelRepository.deleteById(id);
    }
}