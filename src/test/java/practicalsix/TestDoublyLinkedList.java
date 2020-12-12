package practicalsix;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import practicalsix.DoublyLinkedList;

/**
 * A JUnit test suite for the SinglyLinkedList.
 *
 * @author Janyl Jumadinova
 */

public class TestDoublyLinkedList {

  /** The size of the SinglyLinkedList with multiple values. */
  private static final int SIZE = 10;

  @Test
  public void testConstructDoublyLinkedListNotNull() {
    DoublyLinkedList<String> list = new DoublyLinkedList<String>();
    assertTrue(list != null);
  }

  @Test
  public void testConstructDoublyLinkedListCorrectInitialState() {
    DoublyLinkedList<String> list = new DoublyLinkedList<String>();
    assertEquals(list.getSize(), 0);
    assertTrue(list.isEmpty());
    assertEquals(list.getFirst(), null);
    assertEquals(list.getLast(), null);
  }

  @Test
  public void testDoublyLinkedListAfterAddFirst() {
    DoublyLinkedList<String> list = new DoublyLinkedList<String>();
    list.addFirst(new String("Data"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("Data"));
    assertEquals(list.getLast(), new String("Data"));
  }

  @Test
  public void testDoublyLinkedListAfterAddFirstAndRemoveFirst() {
    DoublyLinkedList<String> list = new DoublyLinkedList<String>();
    list.addFirst(new String("Data"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("Data"));
    assertEquals(list.getLast(), new String("Data"));
    list.removeFirst();
    assertEquals(list.getSize(), 0);
    assertTrue(list.isEmpty());
    assertEquals(list.getFirst(), null);
    assertEquals(list.getLast(), null);
  }

  @Test
  public void testDoublyLinkedListAfterAddLastAndRemoveLast() {
    DoublyLinkedList<String> list = new DoublyLinkedList<String>();
    list.addLast(new String("Data"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getLast(), new String("Data"));
    assertEquals(list.getFirst(), new String("Data"));
    list.removeLast();
    assertEquals(list.getSize(), 0);
    assertTrue(list.isEmpty());
    assertEquals(list.getLast(), null);
    assertEquals(list.getFirst(), null);
  }

  @Test
  public void testDoublyLinkedListAfterAddLast() {
    DoublyLinkedList<String> list = new DoublyLinkedList<String>();
    list.addLast(new String("Data"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("Data"));
    assertEquals(list.getLast(), new String("Data"));
  }

  // TODO: Add three more test cases to test DoublyLinkedList methods

  @Test
  public void testAddManyStringsToLinkedListWithAddFirstAndThenRemoveLast() {
    DoublyLinkedList<String> list = new DoublyLinkedList<String>();
    for (int i = 0; i < SIZE; i++) {
      list.addLast(Integer.toString(i));
    }
    assertTrue(!list.isEmpty());
    assertEquals(list.getSize(), SIZE);
    for (int i = 0; i < SIZE; i++) {
      list.removeLast();
    }
    assertTrue(list.isEmpty());
    assertEquals(list.getSize(), 0);
  }

}
