import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class ProductFactory {
    public static Products getProduct(String type, String desc, String name) {

        //create type of product depending on type argument
        switch(type){
            case ("MEAT"):
                return new MeatProduct(desc, name);
            case ("VEGETABLE"):
                return new VegProduct(desc, name);
            case ("DAIRY"):
                return new DairyProduct(desc, name);
        }

        //should not reach here

        return new Products() {
            @Override
            public void notifyCreation() {
                System.out.println("");
            }

            @Override
            public void setBrand(String n) {
                brand = "";
            }
        };

    }

    @Test
    void getMeatProduct(){
        Products test = ProductFactory.getProduct("MEAT".toUpperCase(), "80% Lean", "Beef");
        assertTrue(test instanceof MeatProduct);
    }

    @Test
    void getVegetableProduct(){
        Products test = ProductFactory.getProduct("VeGetAbLe".toUpperCase(), "Purple", "Carrot");
        assertTrue(test instanceof VegProduct);
    }

    @Test
    void getDairyProduct(){
        Products test = ProductFactory.getProduct("dairy".toUpperCase(), "2% Reduced Fat", "Milk");
        assertTrue(test instanceof DairyProduct);
    }

    /*
    COMPOSITE UNIT TEST:

    I WANT TO ADD IN A MEAT PRODUCT INTO THE WAREHOUSE INVENTORY.
    I INDICATE THE TYPE OF PRODUCT TO BE MEAT
    FACTORY WILL CREATE A NEW PRODUCT OF TYPE MEATPRODUCT
     */
}
