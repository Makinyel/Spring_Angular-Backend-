package com.example.pharma.pa.share;

import org.springframework.http.HttpStatus;

public class CarroNotFoundException extends BaseException {


    public CarroNotFoundException(String massage) {
        super(false, HttpStatus.NOT_FOUND,massage,ExceptionCode.CARRO_NOT_FOUND);
    }
}
