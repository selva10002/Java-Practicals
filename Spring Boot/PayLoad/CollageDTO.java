package com.boot.payload;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class CollageDTO 
{
	
	private int collageId;
	
	private String collageName;
	
	private String collageLocation;
	
	private double collageRating;


}
