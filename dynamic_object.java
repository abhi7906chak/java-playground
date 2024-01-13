// In this Inheritancene and dymanic object making is be covered
class car {
    int number;
    String engineName, carNmae, carModal;

    // car() {
    // // super();
    // this.carModal = " simple car";
    // this.carNmae = "Scorpio";
    // System.out.println("Car class Constractor");
    // }

    //// This is the getter setter approch
    public void carSetter(int n, String cNmae, String cModal, String eNmae) {
        this.carModal = cModal;
        this.carNmae = cNmae;
        this.engineName = eNmae;
        this.number = n;
    }

    public void printCarDetails() {
        System.out.println("The number of the car is: " + number);
        System.out.println("The name of the car is: " + carNmae);
        System.out.println("The name of the Engine is: " + engineName);
        System.out.println("The name of the car modal is: " + carModal);
        System.out.println("\n");
    }
}

class Rider extends car {
    String riderName;
    int idNumber;

    // Rider() {
    // // super();
    // System.out.println("This is Rider class");
    // this.idNumber = 100;
    // this.riderName = "RiderClass";
    // }

    public void setRider(int id, String riderName) {
        this.idNumber = id;
        this.riderName = riderName;
    }

    public void PrintRider() {
        System.out.println("Id of the rider is: " + idNumber);
        System.out.println("The name of Rider is: " + riderName);
    }
}

public class dynamic_object {

    public static void main(String[] args) {
        // car Creata = new car();
        // Creata.carSetter(1, "Creata", "TopModal", "F12");
        // Creata.printCarDetails();
        // System.out.println("Now in the Rider class");
        // Rider rider = new Rider();
        // rider.setRider(10, "Abhishek Kumar");
        // rider.PrintRider();

                                   ///////This is dymanic object
        car c = new Rider();
        c.carSetter(1, "Creata", "TopModal", "F12");
        c.printCarDetails();
        // Rider r= new car();

    }
}
