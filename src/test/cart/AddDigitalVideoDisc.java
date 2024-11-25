package test.cart;

import aims.cart.Cart;
import aims.disc.DigitalVideoDisc;


public class AddDigitalVideoDisc {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Test addDigitalVideoDisc(DigitalVideoDisc disc)
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        System.out.println("Test 1: Adding a single disc");
        cart.addDigitalVideoDisc(dvd1);
        cart.printCart();

        // Test addDigitalVideoDisc(DigitalVideoDisc[] dvdList)
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc[] dvdList = {dvd2, dvd3};
        System.out.println("\nTest 2: Adding multiple discs");
        cart.addDigitalVideoDisc(dvdList);
        cart.printCart();

        // Test addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 29.95f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 27.99f);
        System.out.println("\nTest 3: Adding two discs simultaneously");
        cart.addDigitalVideoDisc(dvd4, dvd5);
        cart.printCart();
    }
}
