package com.hotelapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.exception.HotelNotFoundException;
import com.hotelapp.exception.IdNotFoundException;
import com.hotelapp.models.Hotel;
import com.hotelapp.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotelById(int hotelId) {
		Optional<Hotel> hotel = hotelRepository.findById(hotelId);
		if (hotel.isPresent()) {
			return hotel.get();
		} else {
			throw new IdNotFoundException("Hotel with this Id not found");
		}
	}

	@Override
	public void deleteHotel(int hotelId) {
		if (hotelId <= 0) {
			throw new RuntimeException("HotelId should be greater than 0");
		}
		hotelRepository.deleteById(hotelId);
	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		List<Hotel> hotelList = hotelRepository.findByAddressCity(city);
		if (hotelList.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this city not found");
		}
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		List<Hotel> hotelList = hotelRepository.getHotelsByMenu(menuName);
		if (hotelList.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this menu not found");
		}
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String partnerName) {
		List<Hotel> hotelList = hotelRepository.getHotelsByDelivery(partnerName);
		if (hotelList.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this delivery partner not found");
		}
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		List<Hotel> hotelList = hotelRepository.findByAddressStreetName(location);
		if (hotelList.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this location not found");
		}
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		List<Hotel> hotelList = hotelRepository.getHotelsByLocationAndMenu(location, menuName);
		if (hotelList.isEmpty()) {
			throw new HotelNotFoundException("Hotel with this location and menu not found");
		}
		return hotelList;
	}

}
