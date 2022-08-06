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

    public Contact(String name, String birthDate, String phoneNumber) throws ParseException {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
        this.age = (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365) ;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Name: " + this.name + " Age: " + this.age + " Birth Date: " + this.birthDate + " Phone Number: " + this.phoneNumber;
    }

    
  
  
  

}
