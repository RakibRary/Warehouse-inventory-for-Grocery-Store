import java.util.ArrayList;
import java.util.List;

public class order2 {
    private List<Packaging> items = new ArrayList<Packaging>();

    public void addItem(Packaging item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Packaging item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Packaging item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.pack().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
