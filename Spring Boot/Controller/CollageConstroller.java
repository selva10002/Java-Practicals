package com.boot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.payload.CollageDTO;
import com.boot.service.CollageService;

@RestController
@RequestMapping("/collage")
public class CollageConstroller 
{
	@Autowired
	private CollageService collageService;

	@PostMapping("/save")
	public ResponseEntity<CollageDTO> saveCollage(@RequestBody CollageDTO collageDto)
	{
		CollageDTO saveCollage = this.collageService.addCollage(collageDto);
		
		return new ResponseEntity<CollageDTO>(saveCollage,HttpStatus.CREATED);
	}
	
	@GetMapping("/displayAll")
	public ResponseEntity<List<CollageDTO>> displayAllCollage()
	{
		List<CollageDTO> allCollageList = this.collageService.getAllCollageList();
		
		return new ResponseEntity<List<CollageDTO>>(allCollageList,HttpStatus.OK);
	}
	
	@GetMapping("/getCollage/{collageId}")
	public ResponseEntity<CollageDTO> getCollageById(@PathVariable("collageId") int CollageId)
	{
		
		CollageDTO collageById = this.collageService.getCollageById(CollageId);
		return new ResponseEntity<CollageDTO>(collageById,HttpStatus.OK);
	}
	
	@PutMapping("/update/{collageId}")
	public ResponseEntity<CollageDTO> updateCollageById(@RequestBody CollageDTO collageDto,@PathVariable("collageId") int collageId)
	{
		CollageDTO updateCollageByID = this.collageService.updateCollageByID(collageDto, collageId);
		return  new ResponseEntity<CollageDTO>(updateCollageByID,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{collageId}")
	public void deleteCollageById(@PathVariable("collageId") int collageId)
	{
		this.collageService.deleteCollageById(collageId);
		
	}
	
	
}
