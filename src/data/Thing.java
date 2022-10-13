
package data;

import java.io.Serializable;




public abstract class Thing implements Serializable {
    protected String serialNumber; //serial number of the object
    protected String name;         //the name of the object
    protected double price;        //price of the object

    public Thing(String serialNumber, String name, double price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    @Override
    public String toString() {
        return "Thing{" + "serialNumber=" + serialNumber + ", name=" + name + ", price=" + price + '}';
    }
    public abstract String getDescription(); // The function gets description
    public abstract void showDescription(); //The function shows description
    
}
