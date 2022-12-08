public class MeatProduct extends Products{
    MeatTypes meatType;

    @Override
    public void notifyCreation() {
        System.out.println("Meat Product was created.\nType: " + this.meatType);
    }

    @Override
    public void setBrand(String n) {
        brand = "MEA: " + n;
    }

    public MeatProduct(String d, String n){
        description = d;
        name = n;
    }

    public MeatProduct(String d, String n, String b){
        description = d;
        name = n;
        setBrand(b);
    }

    public static void setMeatType(MeatProduct p, MeatTypes meatType) {
        p.meatType = meatType;
    }
}
