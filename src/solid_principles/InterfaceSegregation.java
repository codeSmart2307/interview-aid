package solid_principles;

// If we use one interface to declare all these functions then a
// simple janitor will also have to do the managing and securing tasks
interface Owner {
    void clean();
    void manage();
    void secure();
}

// Therefore, break the interface down into simpler interfaces with
// specific behaviours

interface Cleaner {
    void clean();
}

interface Manager {
    void manage();
}

interface Security {
    void secure();
}

class OfficeOwner implements Manager, Cleaner, Security {

    @Override
    public void clean() {
        System.out.println("Cleaning is being supervised");
    }

    @Override
    public void manage() {
        System.out.println("Managing is being supervised");
    }

    @Override
    public void secure() {
        System.out.println("Securing is being supervised");
    }
}

class OfficeJanitor implements Cleaner {

    @Override
    public void clean() {
        System.out.println("Cleaning");
    }
}

public class InterfaceSegregation {
    public static void main(String[] args) {
        OfficeOwner owner = new OfficeOwner();
        OfficeJanitor janitor = new OfficeJanitor();
        owner.clean();
        owner.manage();
        janitor.clean();
    }
}
