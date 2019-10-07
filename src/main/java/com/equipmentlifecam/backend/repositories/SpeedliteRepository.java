package com.equipmentlifecam.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipmentlifecam.backend.domain.Speedlite;

@Repository
public interface SpeedliteRepository extends JpaRepository<Speedlite, Long>  {
	
	List<Speedlite> findAllByBrand(String brand);

}
