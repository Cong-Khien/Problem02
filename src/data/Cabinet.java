package data;

public class Cabinet extends Furniture {

    private double height;
    private double width;
    private double length;
    private String function; //clothes, books

    public Cabinet(String serialNumber, String name, double price, 
            String type, String color, String material, String manufacturer,
            double height, double width, double length, String function) {
        super(serialNumber, name, price, type, color, material, manufacturer);
        this.height = height;
        this.width = width;
        this.length = length;
        this.function = function;
    }

    
    
    
    @Override
    public  String getDescription(){
        String s = "Serial Number: " + serialNumber
                + "\nName: " + name
                + "\nPrice: " + price + " $"
                + "\nType: " + type
                + "\nMaterial: " + material
                + "\nColor: " + color
                + "\nManufacturer: " + manufacturer
                + "Height: " + height + "cm, Width: " + width + "cm, Length: " + length
                + "cm\nMain Function: " + function;
        return s;
    }

    @Override
    public  void showDescription(){
        System.out.println("INFOMATIONS OF CABINET:");
        System.out.println(getDescription());
    }
   

}
