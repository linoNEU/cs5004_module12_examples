package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A collection class for recyclable items that implements Iterable.
 * This allows us to use the for-each loop to iterate through the collection.
 */
public class EcoRecycleFacility implements RecyclableCollection {
  private final List<RecyclableItem> items;

  /**
   * Constructor.
   */
  public EcoRecycleFacility() {
    items = new ArrayList<>();
  }

  @Override
  public void addItem(RecyclableItem item) {
    items.add(item);
  }

  @Override
  public Iterator<RecyclableItem> getIterator() {
    return items.iterator();
  }
}
