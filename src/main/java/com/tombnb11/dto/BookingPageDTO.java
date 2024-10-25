package com.tombnb11.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookingPageDTO {

	private Integer page = 0;
	private Long totalElements = 0L;

	private List<BookingDTO> bookings;
}





