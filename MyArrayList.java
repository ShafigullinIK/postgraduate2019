import java.util.Arrays;

class MyArrayList {

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int[] arr;

    public MyArrayList() {
        arr = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        arr = new int[capacity];
    }

    public void addLast(int newItem){
        if(size >= arr.length){
            arr = arrayCopy();
        }
        arr[size] = newItem;
        size++;
        showArr();
    }

    private int[] arrayCopy(){
        int[] newArray = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return  newArray;
    }

    private int[] arrayCopy(int newSize){
        int[] newArray = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            newArray[i] = arr[i];
        }
        return  newArray;
    }

    public void showArrayList(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void showArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void trim(){
        if(arr.length > size){
            arr = arrayCopy(size);
        }
        showArr();
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > size){
            return false;
        }
        if(size>=arr.length){
            int[] newArray = new int[arr.length*2];
            for (int i = 0; i < index; i++) {
                newArray[i] = arr[i];
            }
            newArray[index] = value;
            for (int i = index+1; i < size+1; i++) {
                newArray[i] = arr[i-1];
            }
            arr = newArray;
        } else {
            for (int i = size; i > index ; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
        }
        size++;
        showArr();
        return true;
    }

    public boolean remove(int index){
        if(index < 0 || index > size){
            return false;
        }
        for (int i = index; i < size-1 ; i++) {
            arr[i] = arr[i+1];
        }
        size--;
        showArr();
        return true;
    }

    public int get(int index){
        return arr[index];
    }

}
