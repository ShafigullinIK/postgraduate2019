public class MyLinkedList {

    // Поиск по объекту (есть в списке или нет)
    // Удаление объекта по индексу
    // Удаление объекта по value (первого попавшегося)
    // Вставка по индексу
    //

    private Item head;
    private Item current;

    public int getSize() {
        Item temp = head;
        int size = 0;
        while(temp.getNext() != null){
            temp = temp.getNext();
            size++;
        }
        return size;
    }



    public MyLinkedList(int value){
        head = new Item(value, null);
        current = head;

    }

    public void addFirst(int value){
        head = new Item(value, head);
        current = head;

    }

    public boolean hasNext(){
        if(current.getNext() == null){
            return false;
        }
        return true;
    }

    public boolean exist(){
        if (current == null) return false;
        return true;
    }

    public Item getNext(){
        Item temp = current;
        current =  current.getNext();
        return temp;
    }

    public void addLast(int value){
        Item temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new Item(value, null));
        current = head;

    }

    public void printList(){
        while(exist()){
            System.out.println(current.getValue());
            current = current.getNext();
        }
        current = head;
    }



}
