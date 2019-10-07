package com.equipmentlifecam.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipmentlifecam.backend.domain.Camera;

@Repository
public interface CameraRepository extends JpaRepository<Camera, Long>{
	
	List<Camera> findAllByBrand(String brand);

}
