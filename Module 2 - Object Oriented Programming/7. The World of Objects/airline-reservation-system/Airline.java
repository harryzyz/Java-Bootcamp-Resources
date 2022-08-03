public class Airline {
    
    private Person[] seats;

    public Airline() {
        this.seats = new Person[11];
        // for (int i = 0; i < persons.length; i++) {
        //     this.seats[i] = new Person(persons[i]);
        // }
    }

    public Person getPerson(int index) {
        return new Person(this.seats[index]); 
    }

    public void setPerson(Person person) {
        this.seats[person.getSeatNumber()-1] = new Person(person);
    }

    public void createReservation(Person person) {
        while (this.seats[person.getSeatNumber()-1] != null) {
            System.out.println(person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another one.\n");
            person.chooseSeat();
        }
        this.seats[person.getSeatNumber()-1] = new Person(person);
        System.out.println("Thank you " + this.seats[person.getSeatNumber()-1].getName() + " for flying with Java Airlines. Your seat number is " + this.seats[person.getSeatNumber()-1].getSeatNumber() + ".\n");
    }

    public String toString() {
        String temp = "\n";
        for (int i = 0; i < this.seats.length; i++) {
            // temp += "Seat Number: " + i +"\n";
            if (this.seats[i] == null) {
                temp += "Seat " + (i+1) + " is empty.\n\n";
            } else {
                temp += this.seats[i].toString() +"\n";
            }
            
        }
        return temp;
    }
}
