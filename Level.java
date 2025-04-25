//1. This question involves simulation of the play and scoring of a single-player video game. In the game, a player
//attempts to complete three levels. A level in the game is represented by the Level class.

public class Level {
    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private boolean goalReached;
    private int points;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public Level(boolean goalReached, int points) {
        this.goalReached = goalReached;
        this.points = points;
    }

    public boolean goalReached() {
        return goalReached;
    }

    public int getPoints() {
        return points;
    }
}
