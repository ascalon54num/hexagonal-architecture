package com.example.app.api;

import com.example.app.mapper.DtoMapper;
import com.example.appapi.ProfileContract;
import com.example.appapi.dto.NewProfileDto;
import com.example.appapi.dto.ProfileDto;
import com.example.business.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
public class ProfileHttp implements ProfileContract {

    private final ProfileService service;
    private final DtoMapper mapper;

    public List<ProfileDto> findAll() {
        var result = service.getAll();

        return mapper.toDto(result);
    }

    public ProfileDto create(@RequestBody NewProfileDto p) {
        var newProfile = mapper.toVo(p);
        var result = service.create(newProfile);

        return mapper.toDto(result);
    }

}
