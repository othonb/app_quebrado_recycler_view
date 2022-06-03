package br.com.othonbatista.listofproducts;

public class Pessoa {

    private String nome;
    private String idade;
    private int fotoId;

    Pessoa(String nome, String idade, int fotoId) {
        this.nome = nome;
        this.idade = idade;
        this.fotoId = fotoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public int getFotoId() {
        return fotoId;
    }

    public void setFotoId(int fotoId) {
        this.fotoId = fotoId;
    }
}
