package test.cart;

import aims.cart.Cart;
import aims.disc.DigitalVideoDisc;

public class CartTest {

    public static void main(String[] args) {
        Cart cart = new Cart();
        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "The Wachowskis", 136, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 9.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 24.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar", "Sci-Fi", "James Cameron", 162, 21.99f);
        // Add DVDs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        cart.addDigitalVideoDisc(dvd4);
        cart.addDigitalVideoDisc(dvd5);
        // Print the cart contents
        System.out.println("==== Printing Cart Contents ====");
        cart.printCart(); // Should show all the DVDs added
        // Test searching by title
        System.out.println("\n==== Search by Title (valid) ====");
        cart.searchByTitle("Inception"); // Should find Inception

        System.out.println("\n==== Search by Title (partial match) ====");
        cart.searchByTitle("Sci-Fi"); // Should match "The Matrix", "Inception", and "Avatar"

        System.out.println("\n==== Search by Title (invalid) ====");
        cart.searchByTitle("Nonexistent Movie"); // Should show no DVDs found
    }
}
