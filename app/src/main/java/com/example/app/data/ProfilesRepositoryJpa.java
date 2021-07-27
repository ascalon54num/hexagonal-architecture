package com.example.app.data;

import com.example.app.data.entity.ProfileEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProfilesRepositoryJpa extends CrudRepository<ProfileEntity, Long> {

}
