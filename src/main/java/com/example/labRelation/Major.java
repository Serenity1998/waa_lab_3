package com.example.labRelation;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "major")
    private Student student;
}
