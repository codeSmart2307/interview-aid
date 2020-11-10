package solid_principles;

interface Keyboard {
    void type();
}

interface Monitor {
    void display();
}

class MechanicalKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing");
    }
}

class GamingMonitor implements Monitor {
    @Override
    public void display() {
        System.out.println("Displaying");
    }
}

// Instead of tightly coupling the MechanicalKeyboard and GamingMonitor to the
// Alienware PC, we pass in generic interfaces for both so that a user can use the Alienware PC
// with different peripherals
class AlienwarePC {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public AlienwarePC(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    void interact() {
        keyboard.type();
        monitor.display();
    }
}

public class DependencyInversion {

    public static void main(String[] args) {
        Monitor gamingMonitor = new GamingMonitor();
        Keyboard mechanicalKeyboard = new MechanicalKeyboard();
        AlienwarePC pc = new AlienwarePC(mechanicalKeyboard, gamingMonitor);
        pc.interact();
    }
}
