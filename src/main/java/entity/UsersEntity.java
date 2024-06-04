package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "USERS")
public class UsersEntity {
    @Id
    private String userId;

    @Column(name="PWD", nullable = false)
    private String pwd;

    @Column(name="NAME", nullable = false)
    private String name;

    @Column(name="PHONE", nullable = false)
    private String phone;

    @Column(name="NICKNAME", nullable = false)
    private String nickname;

    @Column(name="ADDRESS1", nullable = false)
    private String address1;

    @Column(name="ADDRESS2", nullable = false)
    private String address2;

    @Column(name="EMAIL", nullable = true)
    private String email;
}
