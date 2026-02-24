package com.hotelapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(generator = "add_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "add_id", sequenceName = "address_id")
	private Integer addressId;
	private String streetName;
	private String city;
	private Long zipcode;
	private String state;
	
	public Address(String streetName, String city, Long zipcode, String state) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", zipcode=" + zipcode + ", state=" + state
				+ "]";
	}
	
	
	
}
