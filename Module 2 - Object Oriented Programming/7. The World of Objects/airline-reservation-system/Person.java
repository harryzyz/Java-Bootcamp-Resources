import java.util.Arrays;

public class Person {
    
        
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPassport() {
        // this.passport[0] = this.name;
        // this.passport[1] = this.nationality;
        // this.passport[2] = this.dateOfBirth; 
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    /**
     *  Function name: applyPassport
     *  @return (boolean)
     *
     *  Inside the function:
     *     1. Returns a random boolean of true or false.
     */
    public boolean applyPassport() {
        int randomNumber = (int) (Math.random() * 2);
        boolean bool = true;
        if (randomNumber == 0) {
            bool = false;
        }
        return bool;
    }

    /**
     *  Function name: chooseSeat
     *
     *  Inside the function:
     *    1. Sets this.seat to a random number between 1 -- 11.
     */
    public void chooseSeat() {
        int seatNumber = (int) (Math.random() * 11) + 1;
        setSeatNumber(seatNumber);
    }




    public String toString() {
        return "Name: " + this.name + "\n"
            + "Nationality: " + this.nationality + "\n"
            + "Date of Birth: " + this.dateOfBirth + "\n"
            + "Passport: " + Arrays.toString(this.passport) + "\n"
            + "Seat Number: " + this.seatNumber + "\n";
    }






    
}
