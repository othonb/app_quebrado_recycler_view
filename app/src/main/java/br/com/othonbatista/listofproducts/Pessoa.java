package br.com.othonbatista.listofproducts;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private String idade;
    private int fotoId;

}
