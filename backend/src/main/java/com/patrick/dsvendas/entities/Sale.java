package com.patrick.dsvendas.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = { "name", "visited", "deals", "amount", "date", "seller" })
@Entity
@Table(name = "tb_sales")
public class Sale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;

	@Getter
	@Setter
	private Integer visited;

	@Getter
	@Setter
	private Integer deals;

	@Getter
	@Setter
	private Double amount;

	@Getter
	@Setter
	private LocalDate date;

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

}
