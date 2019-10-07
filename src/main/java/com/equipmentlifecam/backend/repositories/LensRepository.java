package com.equipmentlifecam.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipmentlifecam.backend.domain.Lens;

@Repository
public interface LensRepository extends JpaRepository<Lens, Long> {
	
	List<Lens> findAllByBrand(String brand);

}
