package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.models.Hotel;
import com.hotelapp.service.HotelService;

@RestController
@RequestMapping("/hotels-restapi")
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	//This is a rest endpoint to create new hotel
	@PostMapping("/hotels")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
		Hotel newHotel = hotelService.addHotel(hotel);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Added new hotel");
		return ResponseEntity.ok().headers(headers).body(newHotel);
	};
	
	@PutMapping("/hotels")
	public ResponseEntity<String> updateHotel(@RequestBody Hotel hotel) {
		hotelService.updateHotel(hotel);
		return ResponseEntity.ok("Updated");
	};
	
	@GetMapping("/hotels/hotel-by-id/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable int hotelId) {
		Hotel hotel = hotelService.getHotelById(hotelId);
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "Getting one hotel instance");
		return ResponseEntity.ok().headers(header).body(hotel);
	};
	
	@DeleteMapping("/hotels/hotel-by-id/{hotelId}")
	public ResponseEntity<Void> deleteHotel(@PathVariable int hotelId) {
		hotelService.deleteHotel(hotelId);
		return ResponseEntity.ok().build();
	};
	
	@GetMapping("/hotels/hotel-by-city/{cityName}")
	public ResponseEntity<List<Hotel>> getHotelsByCity(@PathVariable("cityName") String city) {
		List<Hotel> hotel = hotelService.getHotelsByCity(city);
		return ResponseEntity.ok().body(hotel);
	};
	
	@GetMapping("/hotels/hotel-by-menu/{menuName}")
	public ResponseEntity<List<Hotel>> getHotelsByMenu(@PathVariable String menuName) {
		List<Hotel> hotel = hotelService.getHotelsByMenu(menuName);
		return ResponseEntity.ok().body(hotel);
	};
	
	@GetMapping("/hotels/hotel-by-delivery/{partnerName}")
	public ResponseEntity<List<Hotel>> getHotelsByDelivery(@PathVariable String partnerName){
		List<Hotel> hotel = hotelService.getHotelsByDelivery(partnerName);
		return ResponseEntity.ok().body(hotel);
	};
	
	@GetMapping("/hotels/hotel-by-location/{location}")
	public ResponseEntity<List<Hotel>> getHotelsByLocation(@PathVariable String location) {
		List<Hotel> hotel = hotelService.getHotelsByLocation(location);
		return ResponseEntity.ok().body(hotel);
	};
	
	@GetMapping("/hotels/hotel-by-location/{location}/menu-name/{menuName}")
	public ResponseEntity<List<Hotel>> getHotelsByLocationAndMenu(@PathVariable String location, @PathVariable String menuName) {
		List<Hotel> hotel = hotelService.getHotelsByLocationAndMenu(location, menuName);
		return ResponseEntity.ok().body(hotel);
	};
}
