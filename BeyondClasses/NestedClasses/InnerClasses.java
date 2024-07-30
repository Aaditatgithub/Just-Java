class Home {
    private String greeting = "HI";

    class Room {
        public int repeat = 3;

        public void enter() {
            for (int i = 0; i < repeat; i++) {
                greet(greeting);
            }
        }

        public static void greet(String message) {
            System.out.println(message);
        }
    }

    // Method to enter the room
    public void enterRoom() {
        Room room = new Room(); // Creating an instance of the inner class
        room.enter(); // Calling the enter method of the Room class
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Home home = new Home();
        // if you wanna instantiate inner class from outside outerclass
        Home.Room room = home.new Room();
        room.enter();
    }
}
