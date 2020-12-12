package practicalsix;

import practicalsix.DoublyLinkedList;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds for different methods of SinglyLinkedList.
 *
 * @author Janyl Jumadinova
 * @author Peter Snipes
 */

public class Experiment {

  /** Run the experiment campaigns for an algorithm in a SinglyLinkedList. */
  public static void main(String[] args) {

    // Populate the SinglyLinkedList with the specified amount of data.
    DoublyLinkedList<String> list = new DoublyLinkedList<String>();
    System.out.println("Size: " + list.getSize());

    for (int i = 0; i < 20; i++) {
      list.addLast(Integer.toString(i));
    }

    System.out.println("Size: " + list.getSize());
    System.out.println("Is Empty ? " + list.isEmpty());
    System.out.println("First element: " + list.getFirst());
    System.out.println("Last element: " + list.getLast());

    list.addFirst("new data");
    System.out.println("Updated after addition front: " + list.toString());

    list.addLast("new data");
    System.out.println("Updated after addition front: " + list.toString());

    list.removeFirst();
    System.out.println("Updated after removal front: " + list.toString());

    list.removeLast();
    System.out.println("Updated after addition last: " + list.toString());
  }

}
