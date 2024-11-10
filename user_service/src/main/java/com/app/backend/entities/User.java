package com.app.backend.entities;

import com.app.backend.model.Laboratory;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Data
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

	public User() {
		super();
	}

	public User(String email, String nomComplet, String numTel, String profession, byte[] signature,
			Laboratory laboratoire, Long fkIdLaboratoire) {
		super();
		this.email = email;
		this.nomComplet = nomComplet;
		this.numTel = numTel;
		this.profession = profession;
		this.signature = signature;
		this.laboratoire = laboratoire;
		this.fkIdLaboratoire = fkIdLaboratoire;
	}
	
	
}
