package com.masai.exception;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Error {

	private String message;
	private LocalDate date;
	private LocalTime time;
	private String details;

}
