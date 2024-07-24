import iterator.EcoRecycleFacility;
import iterator.GreenEarthRecyclingCenter;
import iterator.RecyclableCollection;
import iterator.RecyclableItem;
import java.util.Iterator;

/**
 * A driver class that demonstrates the use of the iterator pattern.
 */
public class Main {

  /**
   * The main method.
   *
   * @param args The command-line arguments.
   */
  public static void main(String[] args) {
    RecyclableCollection greenEarthRecyclingCenter = new GreenEarthRecyclingCenter();
    greenEarthRecyclingCenter.addItem(new RecyclableItem("Bottle", true));
    greenEarthRecyclingCenter.addItem(new RecyclableItem("Can", true));
    greenEarthRecyclingCenter.addItem(new RecyclableItem("Plastic Bag", false));

    RecyclableCollection ecoRecycleFacility = new EcoRecycleFacility();
    ecoRecycleFacility.addItem(new RecyclableItem("Paper", true));
    ecoRecycleFacility.addItem(new RecyclableItem("Toy", false));
    ecoRecycleFacility.addItem(new RecyclableItem("Cardboard", true));

    printRecyclableItems(greenEarthRecyclingCenter, "Green Earth Recycling Center");
    printRecyclableItems(ecoRecycleFacility, "Eco Recycle Facility");
  }

  private static void printRecyclableItems(RecyclableCollection collection, String collectionName) {
    System.out.println("\nPrinting recyclable items from " + collectionName + ":");
    Iterator<RecyclableItem> iterator = collection.getIterator();
    while (iterator.hasNext()) {
      RecyclableItem item = iterator.next();
      if (item.isRecyclable()) {
        System.out.println(item);
      }
    }
  }
}