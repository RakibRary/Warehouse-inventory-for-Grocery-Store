import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Products {
    String description;
    String name;
    String brand;

    public static Set<String> TypeOfProducts = new HashSet<>(Arrays.asList("MEAT", "VEGETABLE", "DAIRY"));


    Date dateCreated = new Date();

    String getDescription(){
        return description;
    }
    String getName(){
        return name;
    }
    String getBrand(){return brand;}

    public Products(){
        description = "";
        name = "";
        brand = "";
    }

    public abstract void notifyCreation();

    public abstract void setBrand(String n);

}
