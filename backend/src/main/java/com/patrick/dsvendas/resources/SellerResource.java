package com.patrick.dsvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patrick.dsvendas.entities.dto.SellerDTO;
import com.patrick.dsvendas.services.SellerService;


@RestController
@RequestMapping(value = "/sellers")
public class SellerResource {
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> list =  sellerService.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}
