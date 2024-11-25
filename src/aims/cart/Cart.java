package aims.cart;

import aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // Add a single disc
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("Cannot add \"" + disc.getTitle() + "\": Cart is at full capacity.");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("\"" + disc.getTitle() + "\" added to the cart.");
    }

    // Add multiple discs
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
                System.out.println("Cannot add \"" + disc.getTitle() + "\": Cart is full.");
                break;
            }
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("\"" + disc.getTitle() + "\" added to the cart.");
        }
    }

    // Add two discs
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED - 1) {
            System.out.println("Cannot add both discs: Not enough space in the cart.");
            return;
        }
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // Remove a disc
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                System.arraycopy(itemsOrdered, i + 1, itemsOrdered, i, qtyOrdered - i - 1);
                itemsOrdered[--qtyOrdered] = null;
                System.out.println("\"" + disc.getTitle() + "\" removed from the cart.");
                return;
            }
        }
        System.out.println("\"" + disc.getTitle() + "\" was not found in the cart.");
    }

    // Calculate total cost
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Search by ID
    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found: " + itemsOrdered[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVDs found with ID: " + id);
        }
    }

    // Search by title
    public void searchByTitle(String keyword) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(keyword)) {
                System.out.println("Found: " + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No DVDs found with title containing: \"" + keyword + "\".");
        }
    }

    // Print cart contents
    public void printCart() {
        System.out.println("======================= CART =======================");
        System.out.println("Items in your cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i]);
        }
        System.out.printf("Total cost: %.2f%n", totalCost());
        System.out.println("=====================================================");
    }
}
