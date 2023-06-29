package org.itstep.client;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "clients")
public class Client {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String login;
    private String phone;
    private String email;
    private String address;
    private String password;
}
