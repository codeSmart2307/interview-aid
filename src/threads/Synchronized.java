package threads;

import java.io.*;
import java.util.*;

// A Class used to send a message
class Sender {
    // We can also remove the synchronized block inside this method
    // and add the synchronized keyword to the method signature
    public void send(String msg) {
        // Synchronized code block in an instance method
        synchronized (this) {
            System.out.println("Sending\t" + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread  interrupted.");
            }
            System.out.println("\n" + msg + "Sent");
        }
    }
}

// Class for send a message using Threads
class ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    // Recieves a message object and a string
    // message to be sent
    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        sender.send(msg);
    }
}

public class Synchronized {
    public static void main(String args[]) {
        Sender snd = new Sender();
        ThreadedSend S1 =
                new ThreadedSend(" Hi ", snd);
        ThreadedSend S2 =
                new ThreadedSend(" Bye ", snd);

        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();

        // wait for threads to end
        try {
            S1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
