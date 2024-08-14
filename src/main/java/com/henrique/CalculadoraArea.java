package com.henrique;

public class CalculadoraArea {

    public static Poligono descobrePoligono(int numeroLados, double lado) {
        if(numeroLados == 3) {
            return new Poligono("Triângulo", lado, numeroLados, (lado*lado*1.73)/4);
        }
        else if(numeroLados == 4) {
            return new Poligono("Quadrado", lado, numeroLados, (lado*lado));
        }
        else {
            return null;
        }
    }
}
