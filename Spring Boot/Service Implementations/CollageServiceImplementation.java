package com.boot.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.CollageEntity;
import com.boot.exception.ResourseNotFundException;
import com.boot.payload.CollageDTO;
import com.boot.repository.CollageRepository;
import com.boot.service.CollageService;

@Service
public class CollageServiceImplementation implements CollageService 
{
	@Autowired
	private CollageRepository repository;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CollageDTO addCollage(CollageDTO collageDto) 
	{
		CollageEntity CollageEntity = this.modelMapper.map(collageDto, CollageEntity.class);
		com.boot.entity.CollageEntity addCollage = this.repository.save(CollageEntity);
		return this.modelMapper.map(addCollage, CollageDTO.class);
	}

	@Override
	public List<CollageDTO> getAllCollageList() 
	{
		List<CollageEntity> getAllCollage = this.repository.findAll();
		List<CollageDTO> CollageDto = getAllCollage.stream().map(collageObj->this.modelMapper.map(collageObj, CollageDTO.class)).collect(Collectors.toList());
		
		return CollageDto;
	}

	@Override
	public CollageDTO getCollageById(int collageId)
	{
		if(this.repository.existsById(collageId))
		{
		CollageEntity getCollage = this.repository.findById(collageId).get();
		return this.modelMapper.map(getCollage, CollageDTO.class);
	
		}
		else
		{
			throw new ResourseNotFundException("Collage", "Collage Id", collageId);
		}
		
	}

	@Override
	public CollageDTO updateCollageByID(CollageDTO collageDto, int collageId)
	{
		if(this.repository.existsById(collageId))
		{
			
		CollageEntity collageEntity = this.modelMapper.map(collageDto, CollageEntity.class);
		CollageEntity updateCollage = this.repository.save(collageEntity);
		return this.modelMapper.map(updateCollage, CollageDTO.class);
		}
		else
		{
			throw new ResourseNotFundException("Collage", "Collage Id", collageId);
		}
	}

	@Override
	public void deleteCollageById(int collageId) 
	{
		if(this.repository.existsById(collageId))
		{
		this.repository.deleteById(collageId);
		}
		else
		{
			throw new ResourseNotFundException("Collage", "Collage Id", collageId);
		}
	}

}
