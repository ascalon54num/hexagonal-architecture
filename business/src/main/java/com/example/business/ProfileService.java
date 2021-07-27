package com.example.business;

import com.example.business.port.ProfileRepositoryPort;
import com.example.business.objects.NewProfile;
import com.example.business.objects.Profile;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepositoryPort repository;

    public List<Profile> getAll() {
        return repository.findAll();
    }

    public Profile create(NewProfile newProfile) {
        var profile = Profile.of(newProfile);
        return repository.save(profile);
    }

}
