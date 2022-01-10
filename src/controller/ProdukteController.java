package controller;

import model.Produkte;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProdukteController implements ProdukteControllerInterface{
    private final List<Produkte> produkteList;


    public ProdukteController() {
        this.produkteList = new ArrayList<>();
    }

    @Override
    public Produkte addProdukte(String name, Integer price, double sku, int anzProdukte) {
        Produkte tempProdukte = new Produkte(name, price,  sku,  anzProdukte);
        produkteList.add(tempProdukte);
        return tempProdukte;
    }

    @Override
    public void deleteProdukt(String name) {
        produkteList.removeIf(produkte -> Objects.equals(produkte.getName(), name));
    }

    @Override
    public void updateProdukte(String name, Integer price, double sku, int anzProdukte) {
        for (Produkte produkte:
                produkteList) {
            if(Objects.equals(produkte.getName(), name)){
                produkte.setPrice(price);
                produkte.setSku(sku);
                produkte.setAnzProdukte(anzProdukte);
            }
        }
    }

    @Override
    public List<Produkte> getAll() {
        return produkteList;
    }

    @Override
    public Produkte findByName(String  name) {
        for (Produkte produkte:
                produkteList) {
            if(Objects.equals(produkte.getName(), name))
                return produkte;
        }
        return null;
    }
}