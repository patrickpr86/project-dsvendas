package com.patrick.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patrick.dsvendas.entities.Seller;
import com.patrick.dsvendas.entities.dto.SellerDTO;
import com.patrick.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public List<SellerDTO> findAll() {
		List<Seller> sales = sellerRepository.findAll();
		return sales.stream().map(x -> (new SellerDTO(x))).collect(Collectors.toList());
		
	}

}
