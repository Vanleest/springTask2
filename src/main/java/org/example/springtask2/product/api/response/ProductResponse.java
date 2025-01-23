package org.example.springtask2.product.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ProductResponse {

    private final Long id;
    @Getter
    private final String name;

}
