package modul;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Smartphone implements Radio, GPS {


        private String model;
        private String manufacturer;

        private Contact[] contactList;



    // Default constructor
    public Smartphone() {
        super();
    }

    public Smartphone(String model, String manufacturer, Contact[] contactList) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contactList = contactList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getContactList() {
        return contactList;
    }

    public void setContactList(Contact[] contactList) {
        this.contactList = contactList;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
         return false;
    }


    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contactList=" + Arrays.toString(contactList) +
                '}';
    }
}
