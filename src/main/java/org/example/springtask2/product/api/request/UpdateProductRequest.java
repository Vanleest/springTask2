package org.example.springtask2.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public class UpdateProductRequest extends ProductRequest {

    private final Long id;

    @JsonCreator
    public UpdateProductRequest(String name, Long id) {
        super(name);
        this.id = id;
    }

}
