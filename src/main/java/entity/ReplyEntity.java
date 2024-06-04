package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "REPLY")
public class ReplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int replyId;

    private String userId;

    private String nickname;

    private String description;

    private String boardId;
}

