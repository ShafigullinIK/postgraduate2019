import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayList aList = new MyArrayList();
        aList.addLast(-1);
        aList.addLast(1);
        aList.addLast(2);
        aList.addLast(3);
        aList.addLast(4);
        aList.addLast(5);
        aList.addLast(6);
        aList.addLast(7);
        aList.addLast(8);
        aList.addLast(9);
        aList.addLast(10);
        aList.addLast(11);
        aList.insert(4, 154);
        aList.trim();
        aList.remove(2);
        aList.showArrayList();
        System.out.println(aList.get(0));
        ArrayList<String> arr = new ArrayList<>();
    }

}
