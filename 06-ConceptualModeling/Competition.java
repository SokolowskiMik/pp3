public class Competition {
    public static void main(String[] args) {
        // Create judges and competitors
        Judge judge1 = new Judge(4, 5, 3, 2, 4);
        Judge judge2 = new Judge(2, 3, 5, 4, 1);
        Judge judge3 = new Judge(5, 4, 2, 3, 5);

        Competitor competitor1 = new Competitor();
        Competitor competitor2 = new Competitor();
        Competitor competitor3 = new Competitor();

        // Add scores for each competitor
        competitor1.addScore(judge1.getScores().get(0));
        competitor1.addScore(judge1.getScores().get(1));
        competitor1.addScore(judge1.getScores().get(2));
        competitor1.addScore(judge1.getScores().get(3));
        competitor1.addScore(judge1.getScores().get(4));

        competitor2.addScore(judge2.getScores().get(0));
        competitor2.addScore(judge2.getScores().get(1));
        competitor2.addScore(judge2.getScores().get(2));
        competitor2.addScore(judge2.getScores().get(3));
        competitor2.addScore(judge2.getScores().get(4));

        competitor3.addScore(judge3.getScores().get(0));
        competitor3.addScore(judge3.getScores().get(1));
        competitor3.addScore(judge3.getScores().get(2));
        competitor3.addScore(judge3.getScores().get(3));
        competitor3.addScore(judge3.getScores().get(4));

        // Calculate and print final results
        System.out.println("Competitor 1 Final Result: " + competitor1.calculateFinalResult());
        System.out.println("Competitor 2 Final Result: " + competitor2.calculateFinalResult());
        System.out.println("Competitor 3 Final Result: " + competitor3.calculateFinalResult());
    }
}