package com.app.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laboratory {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nom;
    @Lob
    @Column(length = 100000)
    private byte[] logo;
    private Long  nrc;
    private Statut statut;
    private Date dateActivation;
    
    

    
    
}