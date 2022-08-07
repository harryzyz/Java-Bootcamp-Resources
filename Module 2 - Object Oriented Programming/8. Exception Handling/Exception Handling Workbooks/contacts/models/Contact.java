package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
    private String name;
    private int age;
    private String birthDate;
    private String phoneNumber;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null/blank.");
        }

        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone Number cannot be null/blank.");
        }

        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Phone Number must have at least 5 digits.");
        }

        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.age = toAge(birthDate);

    }

    public Contact(Contact source) {
        this.name = source.name;
        this.age = source.age;
        this.birthDate = source.birthDate;
        this.phoneNumber = source.phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null/blank.");
        }
        this.name = name;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone Number cannot be null/blank.");
        }

        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Phone Number must have at least 5 digits.");
        }

        this.phoneNumber = phoneNumber;
    }

    private void setAge(int age) {
        this.age = age;
    }

    /**
     * Name: toAge
     * 
     * @param birthDate
     * @return age (int)
     * @throws ParseException
     *
     *                        Inside the function:
     *                        1. Parses a date from the birthDate String
     *                        2. Gets the current date
     *                        3. Subtracts the difference and returns the age.
     *
     */
    public int toAge(String birthDate) throws ParseException {
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
        int age = (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
        return age;
    }

    public String toString() {
        return "Name: " + this.name +
                "\nPhone Number: " + this.phoneNumber +
                "\nBirth Date: " + this.birthDate + "\nAge: " +
                this.age + " year old\n";
    }

}
