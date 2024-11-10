package com.app.backend.entities;

import com.app.backend.model.Laboratory;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity
public class User {
	@Id
	private String email;
	private String nomComplet;
	private String numTel;
	private String profession;
	@Lob
	@Column(length = 100000)
	private byte[] signature;

	@Transient
	private Laboratory laboratoire;

	private Long fkIdLaboratoire;
}
