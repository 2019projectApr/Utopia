package com.smppthstack.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smppthstack.app.model.Plane;



@Repository
public interface PlaneRepository extends JpaRepository<Plane, Integer> {
	@Query("from Plane where planeId like %:id%")
	public List<Plane> readPlaneById(@Param(value = "id") int id);
}