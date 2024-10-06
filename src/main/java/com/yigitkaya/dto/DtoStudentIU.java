package com.yigitkaya.dto;


import java.sql.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	@NotEmpty(message = "First Name field can not be empty")
	@Min(value = 3)
	@Max(value = 10)
	private String firstName;
	
	private String lastName;
	
	private Date birthOfDate;
}
