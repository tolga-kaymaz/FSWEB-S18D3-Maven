package com.workintech.sqlrelations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "surgery")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nurse_id")
    private Long nurseId;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "doctor_id")
    private Long doctorId;
}
