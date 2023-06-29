package org.itstep.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDao {
    private String name;
    private String login;
    private String prefix;
    private String phone;
    private String email;
    private String address;
    private String password;
    private String password2;
}
