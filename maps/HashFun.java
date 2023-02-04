import java.util.HashMap;
import java.util.Set;
public class HashFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("jdwisecomposer@gmail.com", "Joshua Wise");
        userMap.put("as@gmail.com", "Andrea Steere");
        userMap.put("test@gmail.com", "Testy McTesterson");

        String name = userMap.get("jdwisecomposer@gmail.com");
        System.out.println(name);

        System.out.println("======================");

        Set<String> keys =  userMap.keySet();
        for (String key : keys) {
            System.out.print(key + " ");
            System.out.println(userMap.get(key));
        }
    }
}