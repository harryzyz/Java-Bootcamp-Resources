package src.main.models;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";
    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;

    /*
     * FREQUENTLY ASKED QUESTIONS:
     * 
     * Question: the constants are final, so why can't we make them public? It's not
     * possible for the caller to update them.
     * Answer: Even if the constant is final, I prefer to expose a method instead of
     * the variable. But if you want to expose the variable, that's also correct.
     * 
     */

    public Team(String house, String keeper, String seeker, String[] chasers) {
        checkParam(house);
        checkParam(keeper);
        checkParam(seeker);
        if (hasBlank(chasers) || hasNull(chasers)) {
            throw new IllegalArgumentException("chasers cannot be null/blank");
        }
        if (chasers.length != 3) {
            throw new IllegalArgumentException("there mush be 3 chasers");
        }
        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public Team(Team source) {
        this.house = source.house;
        this.keeper = source.keeper;
        this.seeker = source.seeker;
        this.chasers = Arrays.copyOf(source.chasers, source.chasers.length);
    }

    public static String getPositionChaser() {
        return POSITION_CHASER;
    }

    public static String getPositionSeeker() {
        return POSITION_SEEKER;
    }

    public static String getPositionKeeper() {
        return POSITION_KEEPER;
    }

    public String getHouse() {
        return house;
    }

    public String getKeeper() {
        return keeper;
    }

    public String getSeeker() {
        return seeker;
    }

    public String[] getChasers() {
        return Arrays.copyOf(chasers, chasers.length);
    }

    public void setHouse(String house) {
        checkParam(house);
        this.house = house;
    }

    public void setKeeper(String keeper) {
        checkParam(keeper);
        this.keeper = keeper;
    }

    public void setSeeker(String seeker) {
        checkParam(seeker);
        this.seeker = seeker;
    }

    public void setChasers(String[] chasers) {
        if (hasBlank(chasers) || hasNull(chasers)) {
            throw new IllegalArgumentException("chasers cannot be null/blank");
        }
        if (chasers.length != 3) {
            throw new IllegalArgumentException("there mush be 3 chasers");
        }
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public void checkParam(String param) {
        if (param == null || param.isBlank()) {
            throw new IllegalArgumentException(param + " cannot be null or blank");
        }
    }

    /**
     * Function name: hasNull
     * 
     * @param array
     * @return (boolean)
     * 
     *         Inside the function:
     *         1. return true if the array contain null element.
     */
    public static boolean hasNull(String[] array) {
        return Arrays.stream(array)
                .anyMatch((item) -> item == null);
    }

    /**
     * Function name: hasBlank
     * 
     * @param array
     * @return
     * 
     *         Inside this function:
     *         1. return true if the array contains blank element.
     */
    public static boolean hasBlank(String[] array) {
        return Arrays.stream(array)
                .anyMatch((item) -> item.isBlank());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Team)) {
            return false;
        }
        Team team = (Team) obj;
        return this.house.equals(team.house) &&
                this.keeper.equals(team.keeper) &&
                this.seeker.equals(team.seeker) &&
                Arrays.toString(this.chasers).equals(Arrays.toString(team.chasers));
    }

    public int hashCode() {
        return Objects.hash(house, keeper, seeker, Arrays.toString(chasers));
    }

    public String toString() {
        return "House: " + this.house + "\n" +
                "Keeper: " + this.keeper + "\n" +
                "Seeker: " + this.seeker + "\n" +
                "Chasers: " + Arrays.toString(this.chasers) + "\n";
    }

}
