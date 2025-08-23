package Day6_Ans;

public enum KnowledgeLevel {
    BEGINNER,
    ADVANCED,
    PROFESSIONAL,
    MASTER;

    public static KnowledgeLevel fromScore(int score) {
        if (score >= 0 && score <= 3) {
            return BEGINNER;
        } else if (score >= 4 && score <= 6) {
            return ADVANCED;
        } else if (score >= 7 && score <= 9) {
            return PROFESSIONAL;
        } else if (score == 10) {
            return MASTER;
        } else {
            throw new IllegalArgumentException("Score is from 0 and 10");
        }
    }

    public static void main(String[] args) {
        int[] testScores = {0, 3, 4, 6, 7, 9, 10};

        for (int score : testScores) {
            System.out.printf("Score %d → %s%n", score, fromScore(score));
        }

        try {
            fromScore(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception for -1: " + e.getMessage());
        }

        try {
            fromScore(11);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception for 11: " + e.getMessage());
        }
    }
}

