package org.websparrow.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.websparrow.entity.Country;
import org.websparrow.entity.Nguyenlieu;
import org.websparrow.entity.LoaiNguyenLieu;

import org.websparrow.repository.CountryRepository;
import org.websparrow.repository.NguyenLieuRepository;
import org.websparrow.repository.LoaiNguyenLieuRepository;

@RestController
@RequestMapping("/loainguyenlieu")
public class CountryController {

//	@Autowired
//	CountryRepository countryRepository;
	
//	@Autowired
//	NguyenLieuRepository nguyenLieuRepository; 
	
	@Autowired
	LoaiNguyenLieuRepository loaiNguyenLieuRepository;
	
	// fetch all loainguyenlieu list from database
	@GetMapping("/all")
	public Iterable<LoaiNguyenLieu> allLoaiNguyenLieu() {

		return loaiNguyenLieuRepository.findAll();
	}

	// insert new loainguyenlieu into database
	@PostMapping("/add")
	
	public LoaiNguyenLieu addLoaiNguyenLieu(@RequestBody LoaiNguyenLieu loaiNguyenLieu) {
		
		return loaiNguyenLieuRepository.save(loaiNguyenLieu);
	}
	
	
	// update existing loainguyenlieu
	@PutMapping("/update")
	public LoaiNguyenLieu updateLoaiNguyenLieu(@RequestBody LoaiNguyenLieu loaiNguyenLieu) {

		return loaiNguyenLieuRepository.save(loaiNguyenLieu);
	}
	
	// delete loainguyenlieu from database
	@DeleteMapping("/{loaiNguyenLieuId}")
	public void deleteLoaiNguyenLieu(@PathVariable("loaiNguyenLieuId") int loaiNguyenLieuId) {

		loaiNguyenLieuRepository.deleteById(loaiNguyenLieuId);
	}
	

	
	

	// fetch specific country by their ID
//	@GetMapping("/{countryId}")
//	public Optional<Country> countryById(@PathVariable("countryId") int countryId) {
//
//		return countryRepository.findById(countryId);
//	}
//
//	// update existing country
//	@PutMapping("/update")
//	public Country updateCountry(@RequestBody Country country) {
//
//		return countryRepository.save(country);
//	}


}
