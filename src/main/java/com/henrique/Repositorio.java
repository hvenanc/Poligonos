package com.henrique;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private final List<Poligono> poligonoList = new ArrayList<>();

    public void addPoligono(Poligono poligono) {
        poligonoList.add(poligono);
    }

    public void exibir() {
        for(Poligono pol : poligonoList) {
            System.out.print(pol);
        }
    }

    public Double areaTotal() {
        return poligonoList.stream()
                .mapToDouble(Poligono::getArea)
                .sum();
    }

}
