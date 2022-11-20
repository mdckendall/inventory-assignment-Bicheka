import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items = new ArrayList<>();

    public Inventory(){

    }

    public void addItem(String name, String serialNumber, int value){
       items.add(new Item(name, serialNumber, value));
    }

    public void deleteItem(String serialNumber){
        items.remove(findIndex(serialNumber));
    }

    public void updateItem(String serialNumber, String newName, int newValue){
        items.get(findIndex(serialNumber)).setName(newName);
        items.get(findIndex(serialNumber)).setValue(newValue);
    }

    public void showAllItems(){
        for(Item i : items){
            System.out.println(i.getName()+","+i.getSerialNumber()+","+i.getValue());
        }
    }

    //gets the index of an item object in the ArrayList
    public int findIndex(String serialNumber){
        int index = 0;
        for(Item x : items){
            if(x.getSerialNumber().equals(serialNumber)){
                return index;
            }
            else{
                index++;
            }
        }
       return -1;
    }
}
