package com.szczudlinski.dawid.calculation.calculation.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InsuranceDTO {
    private String code;

    private BigDecimal sum;

    private String baseProduct;
}
