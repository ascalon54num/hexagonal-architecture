package com.example.app.mapper;

import com.example.app.data.entity.ProfileEntity;
import com.example.appapi.dto.NewProfileDto;
import com.example.appapi.dto.ProfileDto;
import com.example.business.objects.NewProfile;
import com.example.business.objects.Profile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    default ProfileDto toDto(Profile v) {
        var result = new ProfileDto();
        result.setId(v.getId());
        result.setFullName(v.getFirstName() + " " + v.getLastName());

        return result;
    }

    @Mappings({
            @Mapping(source = "sureName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName")
    })
    NewProfile toVo(NewProfileDto v);

    default List<ProfileDto> toDto(List<Profile> all) {
        return all.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Profile toVo(ProfileEntity e) {
        var result = new Profile();
        result.setId(e.getId());

        String[] strings = e.getName().split(" ");
        result.setFirstName(strings[0]);
        result.setLastName(strings[1]);

        return result;
    }

    default ProfileEntity toEntity(Profile profile) {
        var result = new ProfileEntity();

        if(profile.getId() != null) {
            result.setId(profile.getId());
        }

        result.setName(profile.getFirstName() + " " + profile.getLastName());

        return result;
    }
}
