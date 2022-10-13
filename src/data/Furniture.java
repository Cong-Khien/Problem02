package data;

public class Furniture extends Thing {
    protected String type; //Side table, Reading lamp,...
    protected String color; // pink, green,...
    protected String material; //Gold, wood, fabric
    protected String manufacturer; 

    public Furniture(String serialNumber, String name, double price,
            String type, String color, String material, String manufacturer) {
        super(serialNumber, name, price);
        this.type = type;
        this.color = color;
        this.material = material;
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
     

    

    @Override
    public  String getDescription(){
        String s = "Serial Number: " + serialNumber
                + "\nName: " + name
                + "\nPrice: " + price + " $"
                + "\nType: " + type
                + "\nMaterial: " + material
                + "\nColor: " + color
                + "\nManufacturer: " + manufacturer;
        return s;
    }

    @Override
    public  void showDescription(){
        System.out.println("INFOMATIONS OF FURNITURE:");
        System.out.println(getDescription());
    }

}
