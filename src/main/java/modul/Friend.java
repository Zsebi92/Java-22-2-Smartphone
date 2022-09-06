package modul;

public class Friend extends Contact{

    String nickName;

    // Empty constructor
    public Friend () {
        super();
    }


    // Constructor with parameters from "Contact Class" and "Friend Class"
    public Friend(String name, int phoneNumber, String nickName) {
        super(name, phoneNumber);
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
