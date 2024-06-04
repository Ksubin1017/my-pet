package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PET")
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="NAME", nullable = false)
    private String name;

    @Column(name="GENDER", nullable = false)
    private String gender;

    @Column(name="AGE", nullable = false)
    private String age;

    @Column(name="CATEGORY", nullable = false)
    private String category;

    @Column(name="DESCRIPTION", nullable = false)
    private String description;

    @Column(name="IMAGE", nullable = false)
    private String image;
}
