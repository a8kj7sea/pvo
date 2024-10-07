package me.a8kj.cache;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a node in a doubly linked list.
 * Each node contains a key-value pair and references to the previous and next
 * nodes in the list.
 *
 * @param <T> the type of keys maintained by this node
 * @param <V> the type of values maintained by this node
 */
@Getter
@Setter
public class Node<T, V> {

    /**
     * The key associated with this node.
     */
    T key;

    /**
     * The value associated with this node.
     */
    V value;

    /**
     * Reference to the previous node in the list.
     */
    Node<T, V> previous;

    /**
     * Reference to the next node in the list.
     */
    Node<T, V> next;

    /**
     * Constructs a new node with the specified key and value.
     *
     * @param key   the key to be associated with this node
     * @param value the value to be associated with this node
     */
    public Node(T key, V value) {
        this.key = key;
        this.value = value;
    }
}
