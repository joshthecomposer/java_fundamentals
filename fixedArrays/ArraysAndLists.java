import java.util.ArrayList;

class ArraysAndLists {

    public static void main(String[] args) {

        // int[] myArray = new int[5];

        // for (int i = 0; i < myArray.length; i++) {
        //     System.out.println(myArray[i]);
        // }

        // String[] fruits = {"apple", "orange", "banana", "pear"};
        // for(int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }
        // String temp;
        // temp = fruits[0];
        // fruits[0] = fruits[1];
        // fruits[1] = temp; 

        // for(int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        ArrayList<Integer> myList = new ArrayList<Integer>();
        

        myList.add(10);
        myList.add(99);
        System.out.println(myList);

        //Getters and Setters
        Integer num = myList.get(0);
        System.out.println(num);

        myList.set(0, 12425231);
        System.out.println(myList);

        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
        System.out.println(things);

    }
}