public class ArraysAndLists {

    public static void main(String[] args) {

        // int[] myArray = new int[5];

        // for (int i = 0; i < myArray.length; i++) {
        //     System.out.println(myArray[i]);
        // }

        String[] fruits = {"apple", "orange", "banana", "pear"};
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        String temp;
        temp = fruits[0];
        fruits[0] = fruits[1];
        fruits[1] = temp; 

        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}