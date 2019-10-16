package com.equipmentlifecam.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipmentlifecam.backend.domain.CameraBrand;

@Repository
public interface CameraBrandRepository extends JpaRepository<CameraBrand, Long>{

}
