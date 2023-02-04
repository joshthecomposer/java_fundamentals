import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random rd = new Random();

    ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            int n = rd.nextInt(21 - 1) + 1;
            result.add(n);
        }
        return result;
    }

    char getRandomLetter() {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int n = rd.nextInt(alphabet.length);
        return alphabet[n];
    }
    String generatePassword() {
        String result = new String();
        for(int i = 0; i < 8; i++) {
            result += getRandomLetter();
        }
        return result;
    }

    String[] getNewPasswordSet(int input) {
        String[] result = new String[input];

        for (int i=0; i < result.length; i++) {
            result[i] = generatePassword();
        }
        return result;
    }

    ArrayList<Integer> shuffleArray(ArrayList<Integer> input) {
        for (int i = 0; i < input.size(); i++) {
            int n = rd.nextInt(10-1) + 1;

            Integer temp = input.get(i);

            input.set(i, input.get(n));
            input.set(n, temp);
        }
        return input;
    }

}