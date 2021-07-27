package com.example.appapi;

import com.example.business.objects.NewProfile;
import com.example.business.objects.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles/v1/")
public interface ProfileContract {

    @GetMapping
    List<Profile> findAll();

    @PostMapping
    Profile create(@RequestBody NewProfile p);

}
