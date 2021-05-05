package com.patrick.dsvendas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patrick.dsvendas.entities.dto.SaleDTO;
import com.patrick.dsvendas.services.SaleService;


@RestController
@RequestMapping(value = "/sales")
public class SaleResource {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list =  saleService.findAll(pageable);
		return ResponseEntity.ok(list);
		
	}

}
