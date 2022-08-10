package src.main.models;

import java.util.HashMap;

public class Game {

    private static final int QUAFFLE_POINTS = 10;
    private static final int SNITCH_POINTS = 150;
    private HashMap<Team, Integer> scoreboard;
    private static int gameCount;

    public Game(Team home, Team away) {
        this.scoreboard = new HashMap<Team, Integer>();
        this.scoreboard.put(new Team(home), 0);
        this.scoreboard.put(new Team(away), 0);
        gameCount++;
    }

    public Integer getScore(Team team) {
        return this.scoreboard.get(team);
    }

    public static int getGameCount() {
        return gameCount;
    }

    public static int getQuafflePoints() {
        return QUAFFLE_POINTS;
    }

    public static int getSnitchPoints() {
        return SNITCH_POINTS;
    }

    public void setScore(Team team, Integer score) {
        if (team == null) {
            throw new IllegalArgumentException("team cannot be null");
        }
        this.scoreboard.put(team, score);
    }

    public Team getTeam(String name) {
        return this.scoreboard.keySet().stream()
                .filter((key) -> key.getHouse().equals(name))
                .findFirst()
                .orElse(null);

        // return this.scoreboard.entrySet().stream()
        // .filter((entry) -> entry.getKey().getHouse().equals(name))
        // .findFirst()
        // .orElse(null)
        // .getKey();

        // return this.scoreboard.keySet().stream()
        // .filter((key) -> key.getHouse().equals(name))
        // .collect(Collectors.toList())
        // .get(0);

        // return this.scoreboard.entrySet().stream()
        // .filter((entry) -> entry.getKey().getHouse().equals(name))
        // .collect(Collectors.toList())
        // .get(0)
        // .getKey();
    }

    /**
     * Function name: getPlaceholder
     * 
     * @param play (String)
     * @return (String)
     * 
     *         Inside the function:
     *         1. Returns a substring between two < > characters.
     */
    public String getPlaceholder(String play) {
        return play.substring(play.indexOf("<") + 1, play.indexOf(">"));
    }

    /**
     * Function name: replacePlaceholder
     * 
     * @param play
     * @param placeholder
     * @param value
     * @return (String)
     * 
     *         Inside the function:
     *         1. Replaces the placeholder in a play with a value
     */
    public String replacePlaceholder(String play, String placeholder, String value) {
        return play.replace("<" + placeholder + ">", value);
    }

    /**
     * Function name: quaffleScore
     * 
     * @param team
     * 
     *             Inside the function:
     *             1. Update the team's points by `QUAFFLE_POINTS`. <---
     */
    public void quaffleScore(Team team) {
        setScore(team, this.getScore(team) + QUAFFLE_POINTS);
    }

    /**
     * Function name: catchSnitch
     * 
     * @param team
     * 
     *             Inside the function:
     *             1. Update the team's points by `SNITCH_POINTS`. <---
     */
    public void catchSnitch(Team team) {
        setScore(team, this.getScore(team) + SNITCH_POINTS);
    }

    public String simulate(String play) {
        String placeholder = getPlaceholder(play);
        Team team = getRandomTeam();
        String temp = "";
        if (placeholder.equals(Team.getPositionChaser())) {
            quaffleScore(team);
            temp = replacePlaceholder(play, placeholder, getRandomChaser(team));
        } else if (placeholder.equals(Team.getPositionSeeker())) {
            catchSnitch(team);
            temp = replacePlaceholder(play, placeholder, team.getSeeker());
        } else if (placeholder.equals(Team.getPositionKeeper())) {
            temp = replacePlaceholder(play, placeholder, team.getKeeper());
        }
        return temp;

    }

    /**
     * Function name: getRandomTeam()
     * 
     * @return (Team)
     * 
     *         1. converts scoreBoard to keySet.
     *         2. converts keyset to array (easier to index).
     *         3. returns a random team from the array of teams.
     */
    public Team getRandomTeam() {
        Object[] teams = scoreboard.keySet().toArray();
        return (Team) teams[random(teams.length)];
    }

    public String getRandomChaser(Team team) {
        return team.getChasers()[random(team.getChasers().length)];
    }

    /**
     * Function name: random
     * 
     * @param range
     * @return int
     * 
     *         Inside the function:
     *         1. Returns a number between 0 and one less the range
     */
    public int random(int range) {
        return (int) (Math.random() * range);
    }

}
