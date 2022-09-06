package modul;

public abstract class Contact {

    String name;
    int phoneNumber;

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(){

    }

    public String getName() {
        return name;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }


}
