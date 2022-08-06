package models;

public class Contact {
    private String name;
    private int age;
    private String birthDate;
    private String phoneNumber;

    public Contact(String name, int age, String birthDate, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;------------------------------+
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
