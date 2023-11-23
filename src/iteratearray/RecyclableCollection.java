package iteratearray;

/**
 * A collection class for recyclable items that implements Iterable.
 * This allows us to use the for-each loop to iterate through the collection.
 */
public class RecyclableCollection {
  private final RecyclableItem[] items;
  private int count;

  /**
   * Constructor.
   */
  public RecyclableCollection() {
    int size = 10; // We assume the collection will not exceed 10 items.
    items = new RecyclableItem[size];
    count = 0;
  }

  /**
   * Adds an item to the collection.
   *
   * @param item The item to add.
   */
  public void addItem(RecyclableItem item) {
    if (count < items.length) {
      items[count] = item;
      count++;
    } else {
      throw new ArrayIndexOutOfBoundsException("Collection is full. Cannot add more items.");
    }
  }

  /**
   * Gets the iterator for the collection.
   *
   * @return The iterator.
   */
  public RecyclableCollectionIterator getIterator() {
    return new RecyclableCollectionIterator(items, count);
  }
}
