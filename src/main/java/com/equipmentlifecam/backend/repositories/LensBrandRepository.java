package com.equipmentlifecam.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipmentlifecam.backend.domain.LensBrand;

@Repository
public interface LensBrandRepository extends JpaRepository<LensBrand, Long> {

}
