package com.example.app.data.entity;

import com.example.business.objects.NewProfile;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class ProfileEntity {

    @Id
    private Long id;

    private String name;

    public static ProfileEntity of(NewProfile newProfile) {
        var result = new ProfileEntity();
        result.setName(newProfile.getName());

        return result;
    }
}
