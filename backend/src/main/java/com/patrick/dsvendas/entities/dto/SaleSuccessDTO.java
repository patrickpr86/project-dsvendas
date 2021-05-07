package com.patrick.dsvendas.entities.dto;

import java.io.Serializable;

import com.patrick.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

}
