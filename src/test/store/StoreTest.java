package test.store;


import aims.disc.DigitalVideoDisc;
import aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Creating instances of DigitalVideoDisc
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 20.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 25.0f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 22.0f);
        // Creating a Store object
        Store store = new Store();
        // Adding DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        // Printing the current list of DVDs in the store
        System.out.println("Current DVDs in the store:");
        store.print();
        // Removing a DVD from the store
        store.removeDVD(dvd2);
        // Printing the list after removal
        System.out.println("\nAfter removing a DVD:");
        store.print();
        // Trying to remove a DVD that is not in the store
        store.removeDVD(dvd2);
    }
}
