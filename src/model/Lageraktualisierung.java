package model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lageraktualisierung {

    int id;
    private Date datum;
    private Map<Produkte, Integer> rightHereMap = new HashMap<Produkte, Integer>();

    public Lageraktualisierung(Date datum, Map<Produkte, Integer> rightHereMap) {
        int id;
        this.datum = datum;
        this.rightHereMap = rightHereMap;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Map<Produkte, Integer> getRightHereMap() {
        return rightHereMap;
    }

    public void setRightHereMap(Map<Produkte, Integer> rightHereMap) {
        this.rightHereMap = rightHereMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Lageraktualisierung{" +
                "datum=" + datum +
                ", rightHereMap=" + rightHereMap +
                '}';
    }
}
