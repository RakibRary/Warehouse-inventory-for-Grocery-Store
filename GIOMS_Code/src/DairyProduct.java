public class DairyProduct extends Products{

    @Override
    public void notifyCreation() {
        System.out.println("Dairy Product created.");
    }

    @Override
    public void setBrand(String n) {
        brand = "DAI: " + n;
    }

    public DairyProduct(String d, String n){
        description = d;
        name = n;
    }

    public DairyProduct(String d, String n, String b){
        description = d;
        name = n;
        setBrand(b);
    }
}
