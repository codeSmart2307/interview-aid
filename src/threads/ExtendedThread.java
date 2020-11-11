package threads;

class ExtendedThread extends Thread {
    private Thread t;
    private String threadName;

    ExtendedThread( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

class TestExtendedThread {

    public static void main(String args[]) {
        ExtendedThread t1 = new ExtendedThread( "Thread-1");
        t1.start();

        ExtendedThread t2 = new ExtendedThread( "Thread-2");
        t2.start();
    }
}
