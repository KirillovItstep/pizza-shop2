package org.itstep;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SampleEncoding {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10); // Strength set as 12
        String encodedPassword = encoder.encode("root");
        System.out.println(encodedPassword);
    }
}
