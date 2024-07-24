import iterator.EcoRecycleFacility;
import iterator.GreenEarthRecyclingCenter;
import iterator.RecyclableCollection;
import iterator.RecyclableItem;
import java.util.Iterator;

/**
 * A collection class for recyclable items that implements Iterable.
 * This allows us to use the for-each loop to iterate through the collection.
 */
public class Main {
  public static void main(String[] args) {
    // Create a recycling center and add some items to it.
    RecyclableCollection greenEarthRecyclingCenter = new GreenEarthRecyclingCenter();
    greenEarthRecyclingCenter.addItem(new RecyclableItem("Bottle", true));
    greenEarthRecyclingCenter.addItem(new RecyclableItem("Can", true));
    greenEarthRecyclingCenter.addItem(new RecyclableItem("Plastic Bag", false));

    // Create another recycling center and add some items to it.
    RecyclableCollection ecoRecycleFacility = new EcoRecycleFacility();
    ecoRecycleFacility.addItem(new RecyclableItem("Paper", true));
    ecoRecycleFacility.addItem(new RecyclableItem("Toy", false));
    ecoRecycleFacility.addItem(new RecyclableItem("Cardboard", true));

    // Using the iterator to traverse through the first collection.
    System.out.println("Printing items from Green Earth Recycling Center:");
    Iterator<RecyclableItem> iterator = greenEarthRecyclingCenter.getIterator();
    while (iterator.hasNext()) {
      RecyclableItem item = iterator.next();
      System.out.println(item.toString());
    }

    // Using the iterator to traverse through the second collection.
    System.out.println("\nPrinting items from Eco Recycle Facility");
    iterator = ecoRecycleFacility.getIterator();
    while (iterator.hasNext()) {
      RecyclableItem item = iterator.next();
      System.out.println(item.toString());
    }
  }
}
