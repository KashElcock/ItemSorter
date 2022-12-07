package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
//        if(Objects.equals(item1.getName(), item2.getName())) return 0;
//        if(item1.getName()== null) return -1;
//        if(item2.getName() == null) return 1;
        return item1.getName().compareTo(item2.getName());
    }
}
