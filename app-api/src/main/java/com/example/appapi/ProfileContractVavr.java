package com.example.appapi;

import com.example.appapi.dto.NewProfileDto;
import com.example.appapi.dto.ProfileDto;
import io.vavr.control.Try;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles/v1/")
public interface ProfileContractVavr {

    @GetMapping
    Try<List<ProfileDto>> findAll();

    @PostMapping
    Try<ProfileDto> create(@RequestBody NewProfileDto p);

}
