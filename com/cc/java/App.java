package com.cc.java;
public class App {

    // static Honeybee worker;

    public static void main(String[] args) {
      
        // Queen queen = new Queen(); 
        // Drone drone = new Drone();
        // Worker worker = new Worker();

        HoneyBee queen = new Queen(); 
        HoneyBee drone = new Drone();
        HoneyBee worker = new Worker();

        output(queen.doYourJob());
        output(drone.doYourJob());
        output(worker.doYourJob());

        output("------------------------------------");

        output(queen.fly());
        output(drone.fly());
        output(worker.fly());

        output("--------------- Aber: -------------");
        
        // Das solte eigentlich nicht gehen!
        // HoneyBee bee = new HoneyBee();
        // output(bee.doYourJob());

  
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
