import static org.junit.jupiter.api.Assertions.*;

class orderBuilderTest {

    @org.junit.jupiter.api.Test
    void meats() {
        order2 item = new order2();
        item.addItem(new Pork());
        item.addItem(new beef());
        item.addItem(new chicken());


    }


    @org.junit.jupiter.api.Test
    void veg() {
    }
}