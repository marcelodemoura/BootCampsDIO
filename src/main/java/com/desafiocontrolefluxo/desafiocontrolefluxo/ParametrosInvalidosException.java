package com.desafiocontrolefluxo.desafiocontrolefluxo;

public class ParametrosInvalidosException extends Throwable {

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }


}
