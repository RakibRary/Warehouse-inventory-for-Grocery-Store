public class WareHouseItems {
    ProductCollection Product;

    public WareHouseItems(ProductCollection products){
        this.Product = products;
    }

    public void printProducts(){
        Iterator iterator = Product.createIterator();
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("|      WAREHOUSE ITEMS      |");
        System.out.println("|                           |");
        System.out.println("-----------------------------");

        while (iterator.hasNext()){
            Product current = (Product)iterator.next();
            System.out.println(current.getProduct());
        }
    }
}
