package com.example.recyclerview;

public class perrosVO {

    private int foto;
    private String nombre;
    private int ranking;

    public perrosVO (){

    }

    public perrosVO(int foto, String nombre, int ranking) {
        this.foto = foto;
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
