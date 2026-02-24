package com.hotelapp.models;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatusCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class APIError {
	String message;
	List<String> details;
	HttpStatusCode  status;
	LocalDateTime timeStamp;
}
