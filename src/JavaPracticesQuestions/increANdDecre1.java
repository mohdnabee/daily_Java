package JavaPracticesQuestions;

public class increANdDecre1 {
    public static void main(String[] args) {
        int points = 105;

        if (points % 7 == 0) {
            points = points + 50;
        }
        if (points % 3 == 2) {
            points = points - 25;
        }
        if (points % 5 == 4) {
            points = points * 2;
        }
        if (points % 2 == 1) {
            points = points / 2;
        }

        System.out.println("Final points: " + points);
    }

}
