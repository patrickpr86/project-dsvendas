package com.patrick.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patrick.dsvendas.entities.Sale;
import com.patrick.dsvendas.entities.dto.SaleDTO;
import com.patrick.dsvendas.repositories.SaleRepository;
import com.patrick.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> sales = saleRepository.findAll(pageable);
		return sales.map(x -> new SaleDTO(x));
		
	}

}
