package concepts.examples.encapsulation;

import java.util.ArrayList;

public class Item {
    //Restrict direct access to inward data
    private ArrayList<String> items = new ArrayList();

    //Provide a way to access data - internal logic can safely be changed in future
    public ArrayList getItems(){
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}
