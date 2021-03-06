package com.patrick.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patrick.dsvendas.entities.Sale;
import com.patrick.dsvendas.entities.dto.SaleDTO;
import com.patrick.dsvendas.entities.dto.SaleSuccessDTO;
import com.patrick.dsvendas.entities.dto.SaleSumDTO;
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
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return saleRepository.amountGroupedBySeller();
		
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return saleRepository.successGroupedBySeller();
		
	}
	

}
