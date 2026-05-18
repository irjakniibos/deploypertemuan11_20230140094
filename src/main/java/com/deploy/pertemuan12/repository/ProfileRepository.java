package com.deploy.pertemuan12.repository;

import com.deploy.pertemuan12.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository extends JpaRepository<Profile, String> {

}
