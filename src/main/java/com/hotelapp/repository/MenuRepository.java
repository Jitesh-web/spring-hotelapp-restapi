package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.models.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
	//derived query
	// List<Menu> findByHotelHotelName(String hotelName);
	
	//JPQL query
	//@Query("SELECT m FROM Menu m JOIN m.hotel h WHERE h.hotelName = ?1")
	//List<Menu> findByHotelName(String hotelName);
	
	//Native query
	@Query(value = "SELECT  m.* FROM menu m INNER JOIN hotel h ON m.hotel_id = h.hotel_id WHERE h.hotel_name = ?1 ", nativeQuery = true)
	List<Menu> findByHotelName(String hotelName);
}
