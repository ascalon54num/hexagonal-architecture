package com.example.app.adapter;

import com.example.app.data.ProfilesRepositoryJpa;
import com.example.app.data.entity.ProfileEntity;
import com.example.app.mapper.ProfileMapper;
import com.example.business.port.ProfileRepositoryPort;
import com.example.business.objects.Profile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ProfileJpaAdapter implements ProfileRepositoryPort {

    private final ProfilesRepositoryJpa repositoryJpa;
    private final ProfileMapper mapper;

    @Override
    public List<Profile> findAll() {
        Iterable<ProfileEntity> all = repositoryJpa.findAll();
        List<Profile> result = new ArrayList<>();

        for (ProfileEntity e : all) {
            result.add(mapper.toVo(e));
        }

        return result;
    }

    @Override
    public Profile save(Profile profile) {
        var e = mapper.toEntity(profile);
        var result = repositoryJpa.save(e);

        return mapper.toVo(result);
    }
}
