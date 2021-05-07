package com.patrick.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.patrick.dsvendas.entities.Sale;
import com.patrick.dsvendas.entities.dto.SaleSuccessDTO;
import com.patrick.dsvendas.entities.dto.SaleSumDTO;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.patrick.dsvendas.entities.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.patrick.dsvendas.entities.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
