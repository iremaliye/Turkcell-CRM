package com.turkcell.crm.catalogService.business.dtos.response.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedProductResponse {

    private int id;
    private String name;
    private String description;
    private double price;
    private int unitInStock;
    private int catalogId;

}
