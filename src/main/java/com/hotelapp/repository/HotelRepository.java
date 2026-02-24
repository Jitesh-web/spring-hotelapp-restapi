package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.models.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	List<Hotel> findByAddressCity(String city);
	List<Hotel> findByAddressStreetName(String location);
	
	@Query("SELECT h FROM Hotel h JOIN h.menuList m WHERE m.menuName = ?1")
	List<Hotel> getHotelsByMenu(String menuName);
	
	@Query("SELECT h FROM Hotel h JOIN h.delivery d WHERE d.partnerName = ?1")
	List<Hotel> getHotelsByDelivery(String partnerName);
	
	@Query("SELECT h FROM Hotel h JOIN h.address a JOIN h.menuList m WHERE a.streetName = ?1 AND m.menuName = ?2")
	List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);
}
