package com.henrique;

public class Poligono {

    private final String nome;
    private final double lado;
    private final double area;

    public Poligono(String nome, double lado, int numeroLados, double area) {
        this.nome = nome;
        this.lado = lado;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return nome + " de lado " + lado + " cm" + " e área " + String.format("%.2f", area) + " cm²\n";
    }
}