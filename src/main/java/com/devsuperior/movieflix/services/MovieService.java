package com.devsuperior.movieflix.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieCardDTO;
import com.devsuperior.movieflix.dto.MovieDetailsDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public MovieDetailsDTO findById(Long id){
		Movie result=repository.findById(id).
		orElseThrow(()-> new ResourceNotFoundException("Id não encontrado!"));
		return new MovieDetailsDTO(result);
	}
	
	@Transactional(readOnly = true)
	public Page<MovieCardDTO> findByGenre(String genreId, Pageable pageable){
		
		Long idConvert = null;
		
		if(!"0".equals(genreId)) {
			 idConvert=Long.parseLong(genreId);
		}
		
		Page<Movie> result=repository.findByGenre(idConvert, pageable);
		return result.map((x)-> new MovieCardDTO(x));
		
	}

}
