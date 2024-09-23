package com.devsuperior.movieflix.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.movieflix.dto.InsertReviewDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.services.ReviewService;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = "/reviews")
public class ReviewController {
	
	@Autowired
	private ReviewService service;
	
	@PreAuthorize("hasRole('ROLE_MEMBER')")
	@PostMapping
	public ResponseEntity<ReviewDTO> insert(@Valid @RequestBody InsertReviewDTO dto){
		ReviewDTO reviewDTO=service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(reviewDTO.getId()).toUri();
		return ResponseEntity.created(uri).body(reviewDTO);
	}

}
