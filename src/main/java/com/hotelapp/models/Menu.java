package com.hotelapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Menu {
	@Id
	@GeneratedValue(generator = "menu_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "menu_id", sequenceName = "menu_id")
	private Integer menuId;
	private String menuName;
	private double price;
	@ManyToOne
	@JoinColumn(name = "hotel_id")
	@JsonIgnore
	private Hotel hotel;
	
	public Menu(String menuName, double price) {
		super();
		this.menuName = menuName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", price=" + price + "]";
	}
	
	
}
