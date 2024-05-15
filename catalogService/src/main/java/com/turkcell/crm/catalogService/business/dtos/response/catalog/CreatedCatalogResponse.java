package com.turkcell.crm.catalogService.business.dtos.response.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedCatalogResponse {

    private int id;
    private String name;
    private String description;
    private double price;
    private int unitInStock;

}
