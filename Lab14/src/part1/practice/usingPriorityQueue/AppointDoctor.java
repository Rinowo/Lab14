package part1.practice.usingPriorityQueue;

import java.util.PriorityQueue;

public class AppointDoctor {
    //Creates a new instance of AppointDoctor

    public AppointDoctor() {
    }

    public static void main(String[] args) {
        //

        //Creating a PriorityQueu
        PriorityQueue pq = new PriorityQueue<>();

        //Creating Doctor objects
        Doctor Cardiologist = new Doctor("Casuality", 1);
        Doctor Gynecologist = new Doctor("Surgery", 2);
        Doctor Paediatric = new Doctor("Routine Chek-up", 3);

        //Adding Doctor objects to the Queue
        pq.offer(Cardiologist);
        pq.offer(Gynecologist);
        pq.offer(Paediatric);

        //Remove the elements from the Queue as per their priorities
        while (!pq.isEmpty()) {
            System.out.println("\n Appointing doctors based on their priorities:");
            System.out.println("**************************************************");

            //Removing the Doctor as per their priorities
            Doctor doctor = ((Doctor) pq.remove());

            //Invoking the toString method
            System.out.println(doctor.toString());
        }
    }
}
