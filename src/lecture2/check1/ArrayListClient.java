package lecture2.check1;


import java.util.ArrayList;

class ArrayListStack {
    private ArrayList<Integer> arrayList;
    private int arraySize;
    private int top;

    public ArrayListStack(int arraySize){
        this.arrayList = new ArrayList<Integer>();
        this.top = -1;
        this.arraySize = arraySize;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == arraySize - 1);
    }

    public void push(int item){
        if(isFull())
            System.out.println("it's full");
        else {
            arrayList.add(item);
            this.top++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("it's Empty");
            return -1;
        } else {
            int returnNum = arrayList.get(top--);
            return returnNum;
        }
    }
}

public class ArrayListClient {
    public static void main(String args[]){

        ArrayListStack arrayListStack = new ArrayListStack(10);
        arrayListStack.push(20);
        System.out.println(arrayListStack.pop());
    }
}
