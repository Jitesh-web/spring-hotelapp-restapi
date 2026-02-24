package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.MenuService;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
		// System.out.println("Hello!!");
	}
	
	@Autowired
	private HotelService hotelService;
	@Autowired
	private DeliveryService deliveryService;
	@Autowired
	private MenuService menuService;

	@Override
	public void run(String... args) throws Exception {
//		Address address = new Address("Rocky bhai Nagar", "Panji", 435621L, "Goa");
//		Menu menu1 = new Menu("Kaju", 20);
//		Menu menu2 = new Menu("Wine", 20);
//		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
//		Delivery delivery1 = deliveryService.getDeliveryByPartner("Swiggy");
//		Set<Delivery> delivery = new HashSet<>(Arrays.asList(delivery1));
//		Hotel hotel = new Hotel("The Goa Hotel", address, menuList, delivery);
//		
//		hotelService.addHotel(hotel);
		
//		Hotel hotel = hotelService.getHotelById(202);
//		System.out.println(hotel);
//		
//		hotel.getAddress().setCity("Karwar");
//		hotelService.updateHotel(hotel);
//		hotel = hotelService.getHotelById(202);
//		System.out.println(hotel);
		
//		Hotel hotel = hotelService.getHotelById(252);
//		System.out.println(hotel);
		
//		Set<Menu> menuList = hotel.getMenuList();
//		for (Menu m: menuList) {
//			if (m.getMenuName().equals("Wine")) {
//				m.setPrice(90);
//			}
//		}
		
//		Set<Delivery> delivery  = hotel.getDelivery();
//		for (Delivery d: delivery) {
//			if (d.getPartnerName().equals("Swiggy")) {
//				d.setCharges(201);
//			}
//		}
//		
//		hotelService.updateHotel(hotel);
//		hotel = hotelService.getHotelById(252);
//		System.out.println(hotel);
		
//		Hotel hotel = hotelService.getHotelById(302);
//		System.out.println(hotel);
//		
//		hotelService.deleteHotel(302);
//		
//		hotel = hotelService.getHotelById(302);
//		System.out.println(hotel);
		
//		List<Hotel> hotel = hotelService.getHotelsByCity("Mangalore");
//		for (Hotel h: hotel) {
//			System.out.println(h);
//		}
		
//		List<Hotel> hotel = hotelService.getHotelsByLocation("RK Nagar");
//		for (Hotel h: hotel) {
//			System.out.println(h.getHotelName() + "----- " + h.getAddress().getStreetName());
//		}
		
//		List<Hotel> hotel = hotelService.getHotelsByMenu("Burger");
//		hotel.stream().forEach(n -> System.out.println(n.getHotelName()));
//		
//		System.out.println();
//		
//		List<Hotel> hotel2 = hotelService.getHotelsByDelivery("Uber");
//		hotel2.stream().forEach(n -> System.out.println(n.getHotelName() + " " + n.getDelivery()));
		
//		List<Hotel> hotel = hotelService.getHotelsByLocationAndMenu("XYZ Nagar", "Idli");
//		hotel.stream().forEach(n -> System.out.println(n.getHotelName() + " " + n.getMenuList()));
		
//		List<Menu> menuList = menuService.getMenusByHotel("The Cake World");
//		menuList.stream().forEach(n -> System.out.println(n.getHotel().getHotelName() + " " + n.getMenuName()));
		
	}

}
