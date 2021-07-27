package com.example.business.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile {

    private Long id;
    private String name;

    public static Profile of(NewProfile newProfile) {
        var result = new Profile();
        result.setName(newProfile.getName());

        return result;
    }
}
