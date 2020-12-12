package practicalsix;

import practicalsix.DoublyLinkedList;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds for different methods of SinglyLinkedList.
 *
 * @author Janyl Jumadinova
 * @author Add Your Name Here
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

    // TODO: Add a print statement displaying the size of the list

    // TODO: Add a print statement indicating if the list is empty

    // TODO: Add a print statement displaying the first element of the list

    // TODO: Add a print statement displaying the last element of the list

    // TODO: Add a statement to add to the front of the list
    // TODO: Add a print statement displaying the updated list

    // TODO: Add a statement to add to the end of the list
    // TODO: Add a print statement displaying the updated list

    // TODO: Add a statement to remove from the front of the list
    // TODO: Add a print statement displaying the updated list

    // TODO: Add a statement to remove from the end of the list
    // TODO: Add a print statement displaying the updated list

  }

}
