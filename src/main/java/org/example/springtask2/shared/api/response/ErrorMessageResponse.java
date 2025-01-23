package org.example.springtask2.shared.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorMessageResponse {
    private final String message;
}
