package com.patrick.dsvendas.entities.dto;

import java.io.Serializable;

import com.patrick.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;

	private Double sum;

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

}
