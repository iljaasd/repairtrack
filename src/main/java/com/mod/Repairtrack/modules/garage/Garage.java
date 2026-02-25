package com.mod.Repairtrack.modules.garage;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Garage {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID garageId;

	@Column(unique = true)
	private String rdwRegistrationNumber;

	@Column(nullable = false)
	private String companyName;

	@Column(nullable = false)
	private String emailAddress;

	@Column(nullable = false)
	private String phoneNumber;

	@Column
	private String address;

	@Column
	private String zipCode;

	@Column
	private String country;
}
