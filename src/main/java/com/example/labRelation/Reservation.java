package com.example.labRelation;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reservationDate;
}
