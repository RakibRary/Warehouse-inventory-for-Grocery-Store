import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Unit1 {

    @Test
    public void unitTest1(){
        WarehouseManager manager1 = new WarehouseManager();
        WarehouseManager manager2 = new WarehouseManager();
        WarehouseManager manager3 = new WarehouseManager();
        WarehouseManager manager4 = new WarehouseManager();

        Order1 order = new Order1();

        order.subscribe(manager1);
        order.subscribe(manager2);
        order.subscribe(manager3);
        order.subscribe(manager4);

        order.setDeliveryStatus("Pending - Yet To Be Shipped");
        Assertions.assertEquals("Pending - Yet To Be Shipped", order.getDeliveryStatus());

        order.unsubscribe(manager3);
        order.unsubscribe(manager4);

        order.setDeliveryStatus("Shipped");
        Assertions.assertEquals("Shipped", order.getDeliveryStatus());
    }
}

