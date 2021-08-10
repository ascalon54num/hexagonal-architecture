package com.example.business;

import com.example.business.objects.NewProfile;
import com.example.business.objects.Profile;
import com.example.business.port.ProfileRepositoryPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProfileServiceTest {

    ProfileRepositoryPort port;
    ProfileService service;

    @BeforeEach
    void setUp() {
        port = mock(ProfileRepositoryPort.class);
        service = new ProfileService(port);
    }

    @Test
    void getAll() {
        when(port.findAll()).thenReturn(Collections.emptyList());
        List<Profile> all = service.getAll();

        assertTrue(all.isEmpty());
    }

    @Test
    void create() {
        when(port.save(any(Profile.class))).thenReturn(null);
        Profile profile = service.create(new NewProfile());

        assertNull(profile);
    }
}
