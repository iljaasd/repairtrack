package com.mod.Repairtrack.modules.mechanic.entity;

import com.mod.Repairtrack.modules.garage.Garage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Mechanic {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID mechanicId;

	@Column
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@ManyToOne
	@JoinColumn(name = "garage_id")
	private Garage garage;

}
