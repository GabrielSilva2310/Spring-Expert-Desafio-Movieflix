package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class InsertReviewDTO {

    @NotBlank(message = "O texto deve ser preenchido!")
    private String text;
  
    @NotNull(message = "Campo requerido")
    private Long movieId;    
    
    public InsertReviewDTO() {
    	
    }
    
	public InsertReviewDTO(String text, Long movieId, Long userId, String userName, String userEmail) {
		this.text = text;
		this.movieId = movieId;
	}
	

	public InsertReviewDTO(Review entity) {
		text = entity.getText();
		movieId = entity.getMovie().getId();
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

}
