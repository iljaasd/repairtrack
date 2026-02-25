package com.mod.Repairtrack.modules.vehicle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID vehicleId;

    @Column(nullable = false, unique = true)
    private String licensePlate;

    @Column(nullable = false)
    private String brand;

	@Column(nullable = false)
	private String model;

    @Column(nullable = false)
    private int yearOfMaking;

}
