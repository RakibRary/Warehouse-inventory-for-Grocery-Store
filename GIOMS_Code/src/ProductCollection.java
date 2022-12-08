public class ProductCollection implements Collection{
    public Iterator createIterator(){
        return new ProductIterator(productList);
    }
    static final int MAX = 6;
    int numberOfItems = 0;
    Product[] productList;
    public void WareHouseMenu(){
        System.out.println("WAREHOUSE MENU OPTIONS");
        System.out.println("1.ITEMS IN WAREHOUSE");
        System.out.println("2.ADD ITEMS TO WAREHOUSE");
        System.out.println("3.EXIT");
    }
    public ProductCollection(){
        productList = new Product[MAX];
        addItem("1.APPLE");
        addItem("2.BANANA");
        addItem("3.COOKIE");
        addItem("4.PEACHES");
        addItem("5.ICE CREAM");
        addItem("6.CRACKER");
    }
    public void addItem(String str){
        Product product = new Product(str);
        if (numberOfItems >= MAX)
            System.out.println("ARRAY IS FULL");
        else{
            productList[numberOfItems] = product;
            numberOfItems = numberOfItems + 1;
        }
    }
}
