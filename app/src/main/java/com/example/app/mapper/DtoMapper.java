package com.example.app.mapper;

import com.example.appapi.dto.NewProfileDto;
import com.example.appapi.dto.ProfileDto;
import com.example.business.objects.NewProfile;
import com.example.business.objects.Profile;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface DtoMapper {

    ProfileDto toDto(Profile v);

    NewProfile toVo(NewProfileDto v);

    default List<ProfileDto> toDto(List<Profile> all) {
        return all.stream().map(this::toDto).collect(Collectors.toList());
    }
}
