package com.cmv.technology.ecommerce.ui.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class EcommerceException extends Throwable implements IErrorCode {

    private final String code;
    private final String message;



}
