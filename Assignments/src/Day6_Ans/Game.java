package Day6_Ans;

enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

class Game1 {
    private int bullets;

    public Game1(Difficulty diff) {
        switch (diff) {
            case EASY:
                bullets = 3000;
                break;
            case MEDIUM:
                bullets = 2000;
                break;
            case HARD:
                bullets = 1000;
                break;
            default:
                bullets = 0; 
        }
        System.out.println("difficult: " + diff + " → bullets: " + bullets);
    }
}

public class Game {
    public static void main(String[] args) {
        new Game1(Difficulty.EASY);
        new Game1(Difficulty.MEDIUM);
        new Game1(Difficulty.HARD);
    }
}

