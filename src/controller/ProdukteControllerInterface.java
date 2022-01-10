package controller;

import model.Produkte;

import java.util.List;

public interface ProdukteControllerInterface {


    /**
     * Add produkt produkte.
     *
     * @param name        the name
     * @param price       the price
     * @param sku         the sku
     * @param anzProdukte the anz produkte
     * @return the produkte
     */
    Produkte addProdukte(String name, Integer price, double sku, int anzProdukte);


    /**
     * Delete produkt.
     *
     * @param name the name
     */
    void deleteProdukt(String name);


    /**
     * Update produkt.
     *
     * @param name        the name
     * @param price       the price
     * @param sku         the sku
     * @param anzProdukte the anz produkte
     */
    void updateProdukte(String name, Integer price, double sku, int anzProdukte);


    /**
     * Gets all.
     *
     * @return the all
     */
    List<Produkte> getAll();


    /**
     * Find by name produkte.
     *
     * @param Name the name
     * @return the produkte
     */
    Produkte findByName(String Name);

}
