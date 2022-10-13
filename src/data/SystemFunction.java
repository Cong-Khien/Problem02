package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SystemFunction {

    private List<Thing> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public SystemFunction() {
    }

    //hàm nhập vào thông tin một video
    public void addAVideo(int n) {
        String serialNumber;
        String name;
        double price;
        String typeOfUser;
        String content;
        String qualityVideo;

        for (int i = 0; i < n; i++) {
            System.out.println("Input Video: #" + (i + 1));

            while (true) {
                System.out.print("Input serial number: ");
                serialNumber = sc.nextLine().trim();
                Thing xxx = searchAThing(serialNumber);
                if (xxx == null) {
                    break;
                } else {
                    System.out.println("Dupliacted serial number: Try with another one!!!");
                }

            }
            System.out.print("Input name of video: ");
            name = sc.nextLine();
            while (true) {
                try {
                    System.out.print("Input price: ");
                    price = Double.parseDouble(sc.nextLine());
                    if (price > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }

            System.out.print("Input user object(adults, children,...): ");
            typeOfUser = sc.nextLine();

            System.out.print("Input content of video(game, music,...,: ");
            content = sc.nextLine();

            System.out.print("Input quality(4k, 2k, 720p,...): ");
            qualityVideo = sc.nextLine();

            Video video = new Video(serialNumber, name, price, typeOfUser, content, qualityVideo);
            arr.add(video);
//            try {
//                FileOutputStream fos = new FileOutputStream("dataobject.khien");
//                ObjectOutputStream oos = new ObjectOutputStream(fos);
//                oos.writeObject(video);
//                oos.close();
//                fos.close();
//            } catch (Exception e) {
//            }

        }

    }

    //hàm nhập vào thông tin một book on tape
    public void addABookOnTape(int n) {
        String serialNumber;
        String name;
        double price;
        String author;
        String content;
        String language;
        int version;

        for (int i = 0; i < n; i++) {
            System.out.println("Input Book: #" + (i + 1));
            while (true) {
                System.out.print("Input serial number: ");
                serialNumber = sc.nextLine().trim();
                Thing xxx = searchAThing(serialNumber);
                if (xxx == null) {
                    break;
                } else {
                    System.out.println("Dupliacted serial number: Try with another one!!!");
                }
            }

            System.out.print("Input name of Book: ");
            name = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Input price: ");
                    price = Double.parseDouble(sc.nextLine());
                    if (price > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }

            System.out.print("Input name of author: ");
            author = sc.nextLine();

            System.out.print("Input content of book(romantic, detective,...): ");
            content = sc.nextLine();

            System.out.print("Input language(english, vietnammise,...): ");
            language = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Input version: ");
                    version = Integer.parseInt(sc.nextLine());
                    if (version > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }

            BookOnTape bookOnTape = new BookOnTape(serialNumber, name, price,
                    author, content, language, version);
            arr.add(bookOnTape);

        }
    }

    //hàm nhập thông tin một đồ nội thất
    public void addAFurniture(int n) {
        String serialNumber;
        String name;
        double price;
        String type;
        String color;
        String material;
        String manufacturer;

        for (int i = 0; i < n; i++) {
            System.out.println("Input Furniture: #" + (i + 1));
            while (true) {
                System.out.print("Input serial number: ");
                serialNumber = sc.nextLine().trim();
                Thing xxx = searchAThing(serialNumber);
                if (xxx == null) {
                    break;
                } else {
                    System.out.println("Dupliacted serial Number: Try with another one!!!");
                }
            }

            System.out.print("Input name of Furniture: ");
            name = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Input price: ");
                    price = Double.parseDouble(sc.nextLine());
                    if (price > 0) {
                        break;
                    } else {
                        System.out.print("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.print("Please, input a positive number!");
                }
            }

            System.out.print("Input type of furniture: ");
            type = sc.nextLine();

            System.out.print("Input color: ");
            color = sc.nextLine();

            System.out.println("Input masterial: ");
            material = sc.nextLine();

            System.out.println("Input name of manufacturer: ");
            manufacturer = sc.nextLine();

            Furniture furniture = new Furniture(serialNumber, name, price, type,
                    color, material, manufacturer);

            arr.add(furniture);
        }
    }

    //hàm nhập thông tin một chiếc tủ
    public void addACabinet(int n) {
        String serialNumber;
        String name;
        double price;
        String type;
        String color;
        String material;
        String manufacturer;
        double height;
        double width;
        double length;
        String function;

        for (int i = 0; i < n; i++) {
            System.out.println("Input Cabinet: #" + (i + 1));
            while (true) {
                System.out.print("Input serial Number: ");
                serialNumber = sc.nextLine().trim();
                Thing xxx = searchAThing(serialNumber);
                if (xxx == null) {
                    break;
                } else {
                    System.out.println("Dupliacted serial number: Try with another one!!!");
                }
            }

            System.out.print("Input name Cabinet: ");
            name = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Input price: ");
                    price = Double.parseDouble(sc.nextLine());
                    if (price > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }

            System.out.print("Input type of Cabinet: ");
            type = sc.nextLine();

            System.out.print("Input color: ");
            color = sc.nextLine();

            System.out.print("Input masterial: ");
            material = sc.nextLine();

            System.out.print("Input name of manufacturer: ");
            manufacturer = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Input height: ");
                    height = Double.parseDouble(sc.nextLine());
                    if (height > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }

            while (true) {
                try {
                    System.out.print("Input width: ");
                    width = Double.parseDouble(sc.nextLine());
                    if (width > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }

            while (true) {
                try {
                    System.out.print("Input length: ");
                    length = Double.parseDouble(sc.nextLine());
                    if (length > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }

            System.out.print("Input function of Cabinet: ");
            function = sc.nextLine();

            Cabinet cabinet = new Cabinet(serialNumber, name, price, type, color,
                    material, manufacturer, height, width, length, function);

            arr.add(cabinet);
        }
    }

    //hàm nhập thông tin một chiếc bàn
    public void addATable(int n) {
        String serialNumber;
        String name;
        double price;
        String type;
        String color;
        String material;
        String manufacturer;
        double height;

        String Shape;

        for (int i = 0; i < n; i++) {
            System.out.println("Input Table: #" + (i + 1));
            while (true) {
                System.out.print("Input serial Number: ");
                serialNumber = sc.nextLine().trim();
                Thing xxx = searchAThing(serialNumber);
                if (xxx == null) {
                    break;
                } else {
                    System.out.println("Dupliacted serial Number: Try with another one!!!");
                }
            }

            System.out.print("Input name of table: ");
            name = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Input price: ");
                    price = Double.parseDouble(sc.nextLine());
                    if (price > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }

            System.out.print("Input type of table: ");
            type = sc.nextLine();

            System.out.print("Input color: ");
            color = sc.nextLine();

            System.out.print("Input material: ");
            material = sc.nextLine();

            System.out.print("Input name of manufacturer: ");
            manufacturer = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Input height: ");
                    height = Double.parseDouble(sc.nextLine());
                    if (height > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                }
            }

            System.out.print("Input shape: ");
            Shape = sc.nextLine();

            Table table = new Table(serialNumber, name, price, type, color, material,
                    manufacturer, Shape, height);

            arr.add(table);
        }
    }

    //hàm tìm kiếm thông tin một thứ theo mã số sê ri
    public Thing searchAThing(String serialNumber) {
        if (arr.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getSerialNumber().equalsIgnoreCase(serialNumber)) {
                return arr.get(i);
            }
        }
        return null;
    }

    public void searchAThing() {
        String keyword;
        System.out.print("Input the serial number to search: ");
        keyword = sc.nextLine();
        Thing xxx = searchAThing(keyword);
        if (xxx == null) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found. Here she/he is");
            xxx.showDescription();
        }
    }

    //hàm update giá tiền
    public void updatePrice(Thing x, double price) {
        x.setPrice(price);
    }

    public void updatePrice() {
        String keyword;
        double newPrice;

        System.out.print("Input the serial number to change: ");
        keyword = sc.nextLine().trim();
        Thing tmp = searchAThing(keyword);

        if (tmp == null) {
            System.out.println("Not Found! Nothing to update");
        } else {
            while (true) {
                try {
                    System.out.print("Input new price: ");
                    newPrice = Double.parseDouble(sc.nextLine());
                    if (newPrice > 0) {
                        break;
                    } else {
                        System.out.println("Please, input a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please, input a positive number!");
                }
            }
            updatePrice(tmp, newPrice);
        }

    }

    //hàm show thông tin tất cả có trong arraylist
    public void showAll() {
        for (Thing thing : arr) {
            thing.showDescription();
        }
    }

    //hàm nhạp hết thông tin vào file
    public void addInfomation() {
        System.out.println("Input filename.text: ");
        String s = sc.nextLine();
        try {
            PrintWriter pw = new PrintWriter("C:\\TuHoc\\JavaLearnOOP\\EntryTest\\Problem02\\Problem02\\" + s +".txt", "UTF-8");
            for (Thing thing : arr) {
                pw.println(thing.getDescription());

            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //hàm show thong tin trong file đọc theo đối tượng từ fi
    public void showAllInfation() {
        System.out.println("Input file.text to show info");
        String s = sc.nextLine();
        File f = new File("C:\\TuHoc\\JavaLearnOOP\\EntryTest\\Problem02\\Problem02\\" + s +".txt");
        try {
            try {
                BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
                String line = null;
                while (true) {
                    line = br.readLine();
                    if (line == null) {
                        break;
                    } else {
                        System.out.println(line);
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (Exception e) {
        }
    }
    
    //hàm show tất cả info bằng object
    public void showAllInfo(){
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("dataobject.khien");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available() > 0){
                obj = ois.readObject();
                System.out.println(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
        }
    }

}
