public class orderBuilder {

    public order2 meats (){
        order2 item = new order2();
        item.addItem(new Pork());
        item.addItem(new beef());
        item.addItem(new chicken());
        return item;
    }

    public order2 veg (){
        order2 item = new order2();
        item.addItem(new greens());
        item.addItem(new fruits());
        return item;
    }
}