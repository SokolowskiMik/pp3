import java.util.*;

public class Competitor {
    private List<Integer> scores;

    public Competitor() {
        this.scores = new ArrayList<>();
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public Double calculateFinalResult() {
        if (this.scores.size() != 5) {
            throw new IllegalStateException("Not all scores are provided");
        }
        List<Integer> sortedScores = new ArrayList<>(scores);
        Collections.sort(sortedScores);
        sortedScores.remove(0);
        sortedScores.remove(sortedScores.size() - 1);
        
        double sum = 0;
        for (int score:sortedScores) {
            sum += score;
        }

        return sum/3.0;
    }
}
