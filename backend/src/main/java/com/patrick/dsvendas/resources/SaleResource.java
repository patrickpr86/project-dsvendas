package com.patrick.dsvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patrick.dsvendas.entities.dto.SaleDTO;
import com.patrick.dsvendas.entities.dto.SaleSuccessDTO;
import com.patrick.dsvendas.entities.dto.SaleSumDTO;
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
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountByGroupedBySeller() {
		List<SaleSumDTO> list =  saleService.amountGroupedBySeller();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successByGroupedBySeller() {
		List<SaleSuccessDTO> list =  saleService.successGroupedBySeller();
		return ResponseEntity.ok(list);
		
	}

}
