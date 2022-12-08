public class VegProduct extends Products{
    @Override
    public void notifyCreation() {
        System.out.println("Vegetable Product was created.");
    }

    @Override
    public void setBrand(String n) {
        brand = "VEG: " + n;
    }

    public VegProduct(String d, String n){
        description = d;
        name = n;
    }

    public VegProduct(String d, String n, String b){
        description = d;
        name = n;
        setBrand(b);
    }
}
