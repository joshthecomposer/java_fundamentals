import java.util.ArrayList;
class ListsOfExceptions {
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(9001);
        myList.add("goodbye world");

        for(int i=0; i<myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}