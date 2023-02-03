import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return String.format("Hello, %s, Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > 0) {
            return "snark";
        }
        if (conversation.indexOf("Alfred") > 0) {
            return "nonsnark";
        }
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("k");  
        String strDate= formatter.format(date);
        int meme = Integer.parseInt(strDate);
        if (meme<11){
            return "Morning!";
        }
        if (meme > 19) {
            return "Night!";
        }
        return "Noon/Afternoon!";
    }

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!


}

