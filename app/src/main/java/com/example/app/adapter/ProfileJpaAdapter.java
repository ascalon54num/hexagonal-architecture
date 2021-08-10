package com.example.app.adapter;

import com.example.app.data.ProfilesRepositoryJpa;
import com.example.app.data.entity.ProfileEntity;
import com.example.business.port.ProfileRepositoryPort;
import com.example.business.objects.Profile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProfileJpaAdapter implements ProfileRepositoryPort {

    private final ProfilesRepositoryJpa repositoryJpa;

    @Override
    public List<Profile> findAll() {
        Iterable<ProfileEntity> all = repositoryJpa.findAll();

//         TODO remap with mapstruct

        return null;
    }

    @Override
    public Profile save(Profile profile) {

//        TODO map to profile to entity

        var result = repositoryJpa.save(null);

//        map entity to profile

        return null;
    }
}
