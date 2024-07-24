package iterator;

import java.util.Iterator;

/**
 * An iterator for the GreenEarthRecyclingCenter class.
 */
public class GreenEarthRecyclingCenterIterator implements Iterator<RecyclableItem> {
  private final RecyclableItem[] items;
  private int currentIndex = 0;
  private final int size;

  /**
   * Constructor.
   *
   * @param items The list of items to iterate through.
   * @param size The number of items in the list.
   */
  public GreenEarthRecyclingCenterIterator(RecyclableItem[] items, int size) {
    this.items = items;
    this.size = size;
  }

  @Override
  public boolean hasNext() {
    return currentIndex < size;
  }

  @Override
  public RecyclableItem next() {
    return items[currentIndex++];
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("Remove not supported.");
  }
}
