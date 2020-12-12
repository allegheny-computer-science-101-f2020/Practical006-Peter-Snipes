package practicalsix;

/*
* Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
*
* Developed for use with the book:
*
*    Data Structures and Algorithms in Java, Sixth Edition
*    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
*    John Wiley & Sons, 2014
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

/**
* A generic singly linked list implementation.
*
* @author Michael T. Goodrich
* @author Roberto Tamassia
* @author Michael H. Goldwasser
* @author Janyl Jumadinova
* @author Add Your Name Here
*/

public class DoublyLinkedList<E> implements Cloneable {

  /**
  * The Node of a singly linked list, which stores a reference to its
  * element and to the subsequent node in the list (or null if this
  * is the last node).
  */
  private static class Node<E> {

    /** The element stored at this node. */
    private E element;
    /** A reference to the previous node in the list. */
    private Node<E> prev;
    /** A reference to the subsequent node in the list. */
    private Node<E> next;

    /**
    * Creates a node with the given element and next node.
    *
    * @param element the element to be stored
    * @param next reference to a node that should follow the new node
    */
    public Node(E element, Node<E> prev, Node<E> next) {
      this.element = element;
      this.prev = prev;
      this.next = next;
    }

    /**
    * Returns the element stored at the node.
    * @return the element stored at the node
    */
    public E getElement() {
      return element;
    }

    /**
    * Returns the node that proceeds this one.
    * @return the previous node
    */
    public Node<E> getPrev() {
      return prev;
    }

    /**
    * Returns the node that follows this one (or null if no such node).
    * @return the following node
    */
    public Node<E> getNext() {
      return next;
    }

    /**
    * Sets the node's previous reference to point to Node prev.
    * @param next the node that should follow this one
    */
    public void setPrev(Node<E> prev) {
      this.prev = prev;
    }

    /**
    * Sets the node's next reference to point to Node next.
    * @param next the node that should follow this one
    */
    public void setNext(Node<E> next) {
      this.next = next;
    }
  }

  /** The head node of the list. */
  private Node<E> head;

  /** The last node of the list. */
  private Node<E> tail;

  /** Number of nodes in the list. */
  private int size;

  /** Constructs an initially empty list. */
  public DoublyLinkedList() {
    head = new Node<>(null, null, null);
    tail = new Node<>(null, head, null);
    head.setNext(tail);
    size = 0;
  }

  /**
  * Returns the number of elements in the linked list.
  * @return number of elements in the linked list
  */
  public int getSize() {
    return size;
  }

  /**
  * Checks to see if the linked list is empty.
  * @return true if the linked list is empty, false otherwise
  */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
  * Returns (but does not remove) the first element of the list.
  * @return element at the front of the list (or null if empty)
  */
  public E getFirst() {
    // TODO: implement this method
  }

  /**
  * Returns (but does not remove) the last element of the list.
  * @return element at the end of the list (or null if empty)
  */
  public E getLast() {
    // TODO: implement this method
  }

  /** Add method to add an element to the front of the list.
  * @param element the new element to add
  */
  public void addFirst(E element) {
    // TODO: implement this method
  }

  /** Add element to the end of the list.
  * @param element the new element to add
  */
  public void addLast(E element) {
    // TODO: implement this method
  }

  /** Remove the first element of the list.
  * @return the removed element
  */
  public E removeFirst() {
    // TODO: implement this method
  }

  /** Remove the last element of the list.
  * @return the removed element
  */
  public E removeLast() {
    // TODO: implement this method
  }

  /** Add element in between the given nodes.
  */
  private void addBetween(E element, Node<E> predecessor, Node<E> successor) {
    // TODO: implement this method
  }

  /** Remove the given node from the list.
  * @return the removed element
  */
  private E remove(Node<E> node) {
    // TODO: implement this method
  }

  /**
  * Produces a string representation of the contents of the list.
  * @return the textual representation of the SinglyLinkedList
  */
  public String toString() {
    StringBuilder sb = new StringBuilder("(");
    Node<E> walk = head;
    while (walk != null) {
      sb.append(walk.getElement());
      if (walk != tail) {
        sb.append(", ");
      }
      walk = walk.getNext();
    }
    sb.append(")");
    return sb.toString();
  }

}
