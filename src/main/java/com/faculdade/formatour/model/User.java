package com.faculdade.formatour.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long user_id;
    private String name;
    private String email;
    private String password;
    private String role;

    @CreationTimestamp
    private LocalDateTime created_at;

}
