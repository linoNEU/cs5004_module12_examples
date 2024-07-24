package iterator;

import java.util.Iterator;

/**
 * An interface for a collection of recyclable items. We shpuld be able to add items to the
 * collection and get an iterator to iterate over the items.
 */
public interface RecyclableCollection {

  /**
   * Adds an item to the collection.
   *
   * @param item The item to add.
   */
  void addItem(RecyclableItem item);

  /**
   * Gets the iterator for the collection.
   *
   * @return The iterator.
   */
  Iterator<RecyclableItem> getIterator();
}
