package main.java.ua.com.entity.bouquet;

import java.util.List;
import java.util.Set;

import main.java.ua.com.entity.plant.Plant;
import main.java.ua.com.entity.accessory.Accessory;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class Bouquet {

    private BouquetCondition bouquetCondition;
    private BouquetPrice bouquetPrice;
    private BouquetSize bouquetSize;
    private BouquetStalk bouquetStalk;
    private BouquetType bouquetType;
    private List<Plant> plants;
    private Set<Accessory> accessories;

    public BouquetCondition getBouquetCondition() {
        return bouquetCondition;
    }

    public void setBouquetCondition(BouquetCondition bouquetCondition) {
        this.bouquetCondition = bouquetCondition;
    }

    public BouquetPrice getBouquetPrice() {
        return bouquetPrice;
    }

    public void setBouquetPrice(BouquetPrice bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }

    public BouquetSize getBouquetSize() {
        return bouquetSize;
    }

    public void setBouquetSize(BouquetSize bouquetSize) {
        this.bouquetSize = bouquetSize;
    }

    public BouquetStalk getBouquetStalk() {
        return bouquetStalk;
    }

    public void setBouquetStalk(BouquetStalk bouquetStalk) {
        this.bouquetStalk = bouquetStalk;
    }

    public BouquetType getBouquetType() {
        return bouquetType;
    }

    public void setBouquetType(BouquetType bouquetType) {
        this.bouquetType = bouquetType;
    }
}
