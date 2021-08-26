package com.janjanee.hw;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Q1. 정렬되어 있지 않은 LinkedList 중복 원소 제거
 *
 * [참고자료]
 * - Java 11 LinkedList 구현체를 참고하여 구현
 */
public class LinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    /**
     * 중첩 루프를 이용한 중복 제거
     * O(n^2)
     */
    public void removeDuplicate() {

        Node<E> current = first;
        Node<E> previous = first;

        while (current != null) {
            Node<E> check = current.next;

            while(check != null) {
                if(current.item.equals(check.item)) {
                    unlink(check, previous);
                } else {
                    previous = check;
                }
                check = check.next;
            }

            current = current.next;
        }
    }

    /**
     * Hash를 이용한 중복 제거
     * O(n)
     */
    public void removeDuplicateWithHash() {
        Set<E> set = new HashSet<>();

        Node<E> current = first;
        Node<E> previous = null;

        while (current != null) {
            E item = current.item;

            if(set.contains(item)) {
                unlink(current, previous);
            } else {
                set.add(item);
                previous = current;
            }
            current = current.next;
        }
    }

    public void add(E item) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(item, null);
        last = newNode;
        if(l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public E remove() {
        Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst();
    }

    private E unlinkFirst() {
        E element = first.item;
        Node<E> next = first.next;
        first.item = null;
        first.next = null;
        first = next;
        if (next == null) {
            last = null;
        }
        size--;
        return element;
    }

    private void unlink(Node<E> current, Node<E> previous) {
        previous.next = current.next;
        size--;
    }

    public int size() {
        return size;
    }

}
