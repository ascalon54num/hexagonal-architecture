package com.example.app.controller;

import com.example.appapi.ProfileContract;
import com.example.business.ProfileService;
import com.example.business.objects.NewProfile;
import com.example.business.objects.Profile;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public class ProfileController implements ProfileContract {

    private final ProfileService service;

    public List<Profile> findAll() {
        return service.getAll();
    }

    public Profile create(@RequestBody NewProfile p) {
        return service.create(p);
    }

}
