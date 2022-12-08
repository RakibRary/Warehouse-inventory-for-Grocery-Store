import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Unit2 {

    @Test
    public void unitTest2(){
        WarehouseManager manager1 = new WarehouseManager();
        WarehouseManager manager2 = new WarehouseManager();
        WarehouseManager manager3 = new WarehouseManager();

        Order1 order = new Order1();

        order.subscribe(manager1);
        order.subscribe(manager2);
        order.subscribe(manager3);

        Assertions.assertEquals(order.getWarehouseManagers().get(0), manager1);
        Assertions.assertEquals(order.getWarehouseManagers().get(1), manager2);
        Assertions.assertEquals(order.getWarehouseManagers().get(2), manager3);
    }
}

