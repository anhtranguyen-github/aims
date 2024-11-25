package aims.store;

import aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("DVD: " + dvd.getTitle() + " has been added to the store.");
    }
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean removed = itemsInStore.remove(dvd);
        if (removed) {
            System.out.println("DVD: " + dvd.getTitle() + " has been removed from the store.");
        } else {
            System.out.println("DVD: " + dvd.getTitle() + " is unavailable in the store.");
        }
    }

    public void print() {
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println(i+1 + ". " + itemsInStore.get(i));
        }
    }
}
