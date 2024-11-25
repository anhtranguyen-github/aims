package test.disc;

import aims.disc.DigitalVideoDisc;

public class TestDigitalVideoDisc {
    public static void main(String[] args) {
        // Test the constructors
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Sci-Fi", "Interstellar", 19.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Christopher Nolan", "Sci-Fi", "Dunkirk", 29.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 24.99f);


        // Test getId method
        System.out.println("ID of dvd1: " + dvd1.getId());
        System.out.println("ID of dvd2: " + dvd2.getId());
        System.out.println("ID of dvd3: " + dvd3.getId());
        System.out.println("ID of dvd4: " + dvd4.getId());


    }
}
