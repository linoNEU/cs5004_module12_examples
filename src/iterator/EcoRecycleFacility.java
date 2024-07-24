package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A collection class for recyclable items. The items are stored in a List but, because we
 * are using an iterator, the underlying data structure can be changed without affecting the
 * client code.
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
