package com.poo.model.alsc2.model;

public interface IPile <T> {
    final static int  DEFAULT_CAPACITY = 6;

    public void stack(final T objet) throws PileFullException;
    public T unstack() throws PileEmptyException;
    public T top() throws PileEmptyException;
    public int capacity();
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public String toString();
    public boolean equals(final Object o);
    public int hashCode();

    /**
     * Mutualisation de code par des méthodes par défaut dans l'interface
     */
    default void checkEmpty() throws PileEmptyException {
        if (this.isEmpty()) {
            throw new PileEmptyException("Pile vide! Impossible de dépiler");
        }
    }
    default void checkFull() throws PileFullException {
        if (this.isFull()) {
            throw new PileFullException("Pile pleine! Impossible d'empiler");
        }
    }
}
