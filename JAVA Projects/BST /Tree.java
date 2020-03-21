import java.util.Collection;

public interface Tree<E> extends Collection<E> {
  /**
   * Return true if the element is in the tree
   */
  public boolean search(E e);

  /**
   * Insert element e into the binary tree
   * Return true if the element is inserted successfully
   */
  public boolean insert(E e);

  /**
   * Delete the specified element from the tree
   * Return true if the element is deleted successfully
   */
  public boolean delete(E e);

  /**
   * Get the number of elements in the tree
   */
  public int getSize();


  /**
   * Inorder traversal from the root
   */
  public default void inorder() {
  }

  /**
   * Postorder traversal from the root
   */
  public default void postorder() {
  }

  /**
   * Preorder traversal from the root
   */
  public default void preorder() {
  }

  /**
   * Return the height of this binary tree
   */
  public int height();
  // Left as exercise: implement in BST

  /**
   * BreadthFirst traversal from the root
   */
  public default void breadthFirstTraversal() {
    // Left as an exercise: implement in BST
  }


  @Override
  /** Return true if the tree is empty */
  public default boolean isEmpty() {
    return this.size() == 0;
  }

  @Override
  public default boolean contains(Object e) {
    return search((E) e);
  }

  @Override
  public default boolean add(E e) {
    return insert(e);
  }

  @Override
  public default boolean remove(Object e) {
    return delete((E) e);
  }

  @Override
  public default int size() {
    return getSize();
  }

  @SuppressWarnings("unchecked")
  @Override
  public default boolean containsAll(Collection<?> c) {
    // Left as an exercise

    boolean result = true;
    for (Object e : c) {
      E i = (E) e;
      if (!this.search(i))
        result = false;

    }
    return result;
  }

  @SuppressWarnings("unchecked")
  @Override
  public default boolean addAll(Collection<? extends E> c) {
    // Left as an exercise


    for (Object e : c) {
      E i = (E) e;
      this.add(i);
      return false;
    }

    return true;
  }

  @SuppressWarnings("unchecked")
  @Override
  public default boolean removeAll(Collection<?> c) {
    // Left as an exercise

    for (Object e : c) {
      E i = (E) e;
      if (this.search(i)) {
        this.remove(i);
      }
    }
    return true;
  }

  @SuppressWarnings("unchecked")
  @Override
  public default boolean retainAll(Collection<?> c) {
    // Left as an exercise


    for (Object e : this) {
      if (!c.contains(e)) {
        this.remove(e);
      }
    }

    return true;

  }

  @Override
  public default Object[] toArray() {
    // Left as an exercise

    int count = 0;
    Object[] temp = new Object[this.getSize()];
    for (Object e : this) {
      temp[count] = e;
      count++;
    }
    return temp;

  }

  @SuppressWarnings("unchecked")
  @Override
  public default <T> T[] toArray(T[] array) {
    // Left as an exercise

    int count = 0;
    for (Object e : this) {
      array[count] = (T) e;
      count++;
    }
    return array;


  }


}



