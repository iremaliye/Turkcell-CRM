package com.turkcell.crm.catalogService.business.dtos.response.productProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllProductPropertyResponse {
    private int id;

    private String productName;
    //  private String catalogPropertyName;
    //  private String catalogPropertyDetail;
    private String key;
    private String value;

    //private Map<String, String> properties;

}
