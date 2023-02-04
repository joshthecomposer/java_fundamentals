import java.util.ArrayList;
class TestPuzzle {
    public static void main(String[] args) {

        PuzzleJava pj = new PuzzleJava();
        
        // int[] tenRolls = pj.getTenRolls(10);
        // for (int i : tenRolls) {
        //     System.out.println(i);
        // }

        // char randomLetter = pj.getRandomLetter();
        // System.out.println(randomLetter);

        // String password = pj.generatePassword();
        // System.out.println(password);

        // String[] set = pj.getNewPasswordSet(300);
        // for (String i : set) {
        //     System.out.println(i);
        // }

        ArrayList<Integer> input = pj.getTenRolls();
        System.out.println(input);
        for (int i = 0; i < 30; i++) {
            System.out.println(pj.shuffleArray(input));
        }

    }
}