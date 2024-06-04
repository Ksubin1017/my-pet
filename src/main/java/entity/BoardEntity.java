package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "BOARD")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardId;

    private String userId;

    @Column(name="NICKNAME", nullable = false)
    private String nickname;

    @Column(name="TITLE", nullable = false)
    private String title;

    @Column(name="DESCRIPTION", nullable = false)
    private String description;

    @Column(name="LOCATION", nullable = false)
    private String location;

    @Column(name="IMAGE", nullable = false)
    private String image;
}
