package me.a8kj.common.cache.impl;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import me.a8kj.common.cache.service.CacheService;

public class LRUCacheServiceQueueBased<T, V> implements CacheService<T, V> {
    private final int capacity;
    private final Map<T, V> cacheMap;
    private final Deque<T> deque;

    /**
     * Constructor to initialize LRU Cache with the specified capacity.
     *
     * @param capacity the maximum number of elements the cache can hold
     */
    public LRUCacheServiceQueueBased(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.deque = new LinkedList<>();
    }

    /**
     * Adds an element to the cache. If the element already exists, it updates the
     * value and
     * moves the element to the front of the deque. If the cache is full, it removes
     * the least
     * recently used element before adding the new element.
     *
     * @param id    the key of the element to be added
     * @param value the value of the element to be added
     */
    @Override
    public void put(T id, V value) {
        if (cacheMap.containsKey(id)) {
            deque.remove(id);
        } else {
            if (deque.size() == capacity) {
                T leastUsedKey = deque.removeLast();
                cacheMap.remove(leastUsedKey);
            }
        }
        deque.addFirst(id);
        cacheMap.put(id, value);
    }

    /**
     * Retrieves an element from the cache. If the element exists, it moves the
     * element to the front
     * of the deque to mark it as recently used.
     *
     * @param id the key of the element to be retrieved
     * @return the value of the element if it exists, otherwise null
     */
    @Override
    public V get(T id) {
        if (!cacheMap.containsKey(id)) {
            return null;
        }
        deque.remove(id);
        deque.addFirst(id);
        return cacheMap.get(id);
    }

    /**
     * Evicts an element from the cache based on the key.
     *
     * @param id the key of the element to be evicted
     */
    @Override
    public void evict(T id) {
        if (cacheMap.containsKey(id)) {
            deque.remove(id);
            cacheMap.remove(id);
        }
    }

    // Main method to test the LRUCacheService implementation
    public static void main(String[] args) {
        CacheService<Integer, String> cache = new LRUCacheServiceQueueBased<>(3);
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");
        System.out.println(cache.get(1)); // Output: one
        cache.put(4, "four");
        System.out.println(cache.get(2)); // Output: null (evicted)
        cache.put(5, "five");
        System.out.println(cache.get(3)); // Output: null (evicted)
        System.out.println(cache.get(4)); // Output: four
        System.out.println(cache.get(5)); // Output: five
    }
}
