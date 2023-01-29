package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@Entity
@Table(name="collage_tbl")
public class CollageEntity 
{
	@Id
	private int collageId;
	@Column(length=30)
	private String collageName;
	@Column(length=40)
	private String collageLocation;
	@Column(length=5)
	private double collageRating;
	
	

}
