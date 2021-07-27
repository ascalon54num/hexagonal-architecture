package com.example.business.port;

import com.example.business.objects.Profile;

import java.util.List;

public interface ProfileRepositoryPort {

    List<Profile> findAll();

    Profile save(Profile profile);
}
