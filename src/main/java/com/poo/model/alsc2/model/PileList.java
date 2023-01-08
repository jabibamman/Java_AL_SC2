package com.poo.model.alsc2.model;

import java.util.ArrayList;
import java.util.List;

public class PileList<T> implements IPile<T> {
    private List<T> list;
    private int capacity;

    public PileList(final int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<T>(capacity);
    }

    public PileList() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void stack(T objet) throws PileFullException {
        checkFull();
        this.list.add(objet);
    }

    @Override
    public T unstack() throws PileEmptyException {
        checkEmpty();
        T top = top();
        this.list.remove(this.list.size() - 1);

        return top;
    }

    @Override
    public T top() throws PileEmptyException {
        checkEmpty();
        return this.list.get(this.list.size() - 1);
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return this.list.size() == capacity;
    }
}
