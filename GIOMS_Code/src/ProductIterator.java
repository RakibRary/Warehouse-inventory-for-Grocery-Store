public class ProductIterator implements Iterator{
    Product[] productList;
    int position = 0;

    public  ProductIterator (Product[] productList){
        this.productList = productList;
    }

    public Object next(){
        Product product =  productList[position];
        position += 1;
        return product;
    }

    public boolean hasNext(){
        if (position >= productList.length ||productList[position] == null) return false;
        else return true;
    }
}
