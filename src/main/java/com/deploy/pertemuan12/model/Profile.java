package com.deploy.pertemuan12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
    @Id
    private String id;
    private String nama;
    private String alamat;
    @OneToOne
    @JoinColumn(name= "user_id", referencedColumnName = "id")
    private User user;
}
