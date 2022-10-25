package entities;
import core.loging.Logger;


public class Product {
    private int id;
    private String name;
    private int unitPrice;

    public String getName() {
        return name;
    }

    public void Product() {

    }

    public Product(int id, String name, int unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }


}
