import modul.Contact;
import modul.Friend;
import modul.Smartphone;

public class Main {

    public static void main(String[] args) {

        // Contact list of all friends
        Friend friend1 = new Friend("Harry", 123456789, "HR");
        Friend friend2 = new Friend("Swagrit", 987654321, "SG");
        Friend friend3 = new Friend("Detflef", 852469713,"DD");
        Friend friend4 = new Friend("Haiko", 987321456, "Iko");

        // put in a array together
        Contact[] contactList = { friend1, friend2, friend3, friend4};


        String model = "Iphone 10";
        String manufacture = "Apple";

        //
        Smartphone smartphone1 = new Smartphone(model,manufacture, contactList);

        System.out.println(smartphone1.toString());

    }
}
