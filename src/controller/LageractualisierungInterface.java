package controller;

import model.Lageraktualisierung;
import model.Produkte;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface LageractualisierungInterface {


    /**
     * Add lageraktualisierung produkte.
     *
     * @param id           the id
     * @param datum        the datum
     * @param rightHereMap the right here map
     * @return the produkte
     */
    Produkte addLageraktualisierung(Integer id, Date datum, Map<Produkte, Integer> rightHereMap);


    /**
     * Delete lageraktualisierung.
     *
     * @param id the id
     */
    void deleteLageraktualisierung(int id);


    /**
     * Update lageraktualisierung.
     *
     * @param id           the id
     * @param datum        the datum
     * @param rightHereMap the right here map
     */
    void updateLageraktualisierung(Integer id, Date datum, Map<Produkte, Integer> rightHereMap);


    /**
     * Gets all.
     *
     * @return the all
     */
    List<Lageraktualisierung> getAll();


    /**
     * Find by id lageraktualisierung.
     *
     * @param id the id
     * @return the lageraktualisierung
     */
    Lageraktualisierung findById(Integer id);
}
