package com.boot.service;

import java.util.List;

import com.boot.payload.CollageDTO;

public interface CollageService 
{
	//add collage Method
	public CollageDTO addCollage(CollageDTO collageDto);
	
	//get all collage By List
	public List<CollageDTO> getAllCollageList();
	
	//get collage by id
	public CollageDTO getCollageById(int collageId);
	
	//update collage By Id
	public CollageDTO updateCollageByID(CollageDTO collageDto,int collageId);
	
	//delete Collage By Id
	public void deleteCollageById(int CollageId);

}
