package com.huertos.huertosapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "parcels")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre de la parcela no puede estar vacío")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "La ubicación no puede estar vacía")
    @Column(nullable = false)
    private String location;

    @Column(name = "soil_type")
    private String soilType;

    @Column(name = "owner_or_lead")
    private String ownerOrLead;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}