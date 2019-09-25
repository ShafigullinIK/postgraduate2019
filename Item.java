public class Item {

    private int value;
    private Item next;

    public Item(int value, Item next){
        this.value = value;
        this.next = next;
    }

    public int getValue(){
        return value;
    }

    public Item getNext(){
        return next;
    }

    public void setNext(Item next){
        this.next = next;
    }

}
