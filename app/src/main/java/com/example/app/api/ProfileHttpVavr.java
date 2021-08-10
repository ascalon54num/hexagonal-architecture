package com.example.app.api;

import com.example.app.mapper.ProfileMapper;
import com.example.appapi.ProfileContractVavr;
import com.example.appapi.dto.NewProfileDto;
import com.example.appapi.dto.ProfileDto;
import com.example.business.ProfileService;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("profile/vavr")
@RequiredArgsConstructor
public class ProfileHttpVavr implements ProfileContractVavr {

    private final ProfileService service;
    private final ProfileMapper mapper;

    public Try<List<ProfileDto>> findAll() {
        return Try.of(service::getAll)
                .map(mapper::toDto);
    }

    public Try<ProfileDto> create(@RequestBody NewProfileDto p) {
        return Try.of(() -> p)
                .map(mapper::toVo)
                .map(service::create)
                .map(mapper::toDto);
    }

}
