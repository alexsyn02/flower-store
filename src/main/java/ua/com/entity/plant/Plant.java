package main.java.ua.com.entity.plant;

/**
 * Created by Alexandr on 25.07.2017.
 */
public class Plant {

    private String name;

    Plant() {
        setName("");
    }

    Plant(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
