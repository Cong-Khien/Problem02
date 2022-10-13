
package data;


public class Table extends Furniture {
    private String Shape; //rectangle, disk,...
    private double height;
    

    public Table(String serialNumber, String name, double price, 
            String type, String color, String material, String manufacturer,
            String Shape, double height) {
        super(serialNumber, name, price, type, color, material, manufacturer);
        this.Shape = Shape;
        this.height = height;
        
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
                + "cm\nShape: " + Shape;
        return s;
    }

    @Override
    public  void showDescription(){
        System.out.println("INFOMATION OF TABLE:");
        System.out.println(getDescription());
    }
    
    
    
}
