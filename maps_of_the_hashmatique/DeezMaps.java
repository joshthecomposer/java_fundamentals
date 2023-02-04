import java.util.HashMap;
import java.util.Set;
class DeezMaps {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Twinkle Twinkle", "LELELELE...");
        trackList.put("ABCs", "A B C D E F G...");
        trackList.put("BORN IN THE USA", "BOOOOOORN IN THE USAAAAAAAA.....");
        trackList.put("Your own personal jesus", "DADADADADAD....");

        String oneSong = trackList.get("ABCs");
        System.out.println(oneSong);

        Set<String> songs = trackList.keySet();
        System.out.println(songs);
        for(String key : songs) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}