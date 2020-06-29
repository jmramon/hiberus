package com.bill.Entities;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Product {
    private Long id;
	private int quantity;
	private BigDecimal cost;
}