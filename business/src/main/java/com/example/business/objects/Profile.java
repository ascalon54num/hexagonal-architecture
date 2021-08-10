package com.example.business.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile {

    private Long id;
    private String firstName;
    private String lastName;
    private String secret;

    public static Profile of(NewProfile newProfile) {
        var result = new Profile();

        result.setFirstName(newProfile.getFirstName());
        result.setLastName(newProfile.getLastName());

        return result;
    }
}
