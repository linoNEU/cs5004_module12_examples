package iterator;

import java.util.Iterator;

/**
 * A collection class for recyclable items. The items are stored in an array but, because we
 * are using an iterator, the underlying data structure can be changed without affecting the
 * client code.
 */
public class GreenEarthRecyclingCenter implements RecyclableCollection {
  private final RecyclableItem[] items;
  private int count;

  /**
   * Constructor.
   */
  public GreenEarthRecyclingCenter() {
    int size = 10; // We assume the collection will not exceed 10 items.
    items = new RecyclableItem[size];
    count = 0;
  }

  @Override
  public void addItem(RecyclableItem item) {
    if (count < items.length) {
      items[count] = item;
      count++;
    } else {
      throw new ArrayIndexOutOfBoundsException("Collection is full. Cannot add more items.");
    }
  }

  @Override
  public Iterator<RecyclableItem> getIterator() {
    return new GreenEarthRecyclingCenterIterator(items, count);
  }
}
