package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.dto.InsertReviewDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;

@Service 
public class ReviewService {
	
	@Autowired
	private ReviewRepository repository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private AuthService authService;
	
	
	public ReviewDTO insert(InsertReviewDTO dto) {
		Review entity=new Review();
		entity.setText(dto.getText());
		entity.setMovie(movieRepository.getReferenceById(dto.getMovieId()));
		entity.setUser(authService.authenticated());
		entity=repository.save(entity);
		
		return new ReviewDTO(entity);
		
	}

}
