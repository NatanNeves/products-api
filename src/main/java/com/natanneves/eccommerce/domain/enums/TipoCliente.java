package com.natanneves.eccommerce.domain.enums;

public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Fisica"),
    PESSOAJURIDICA(2, "Pessoa Juridica");

    private Integer cod;
    private String tipo;

    private TipoCliente(int cod, String tipo){
     this.cod = cod;
     this.tipo = tipo;
    }

    public Integer getCod(){
        return this.cod;
    }

    public String getTipo(){
        return this.tipo;
    }

    public static TipoCliente toEnum(Integer cod){
        if (cod == null){
            return null;
        }
        for (TipoCliente x : TipoCliente.values()){
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id invalido" + cod);
    }
}
