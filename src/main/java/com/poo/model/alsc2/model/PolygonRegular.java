package com.poo.model.alsc2.model;


public class PolygonRegular {
    private final int MIN = 1;
    private final int MAX_NUMBER_OF_SIDES = 10;
    private final int MAX_SIDE_LENGTH = 10000;

    private int numberOfSides;
    private double sideLength;

    /**
     * Constructeur par défaut
     */
    public PolygonRegular() {
        this.numberOfSides = 4;
        this.sideLength = 1;
    }

    /**
     * Constructeur naturel
     *
     * @param numberOfSides
     * @param sideLength
     */
    public PolygonRegular(int numberOfSides, double sideLength) {
        checkParameters(numberOfSides);
        checkParameters(sideLength);
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    /**
     *  Getters
     */
    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    /**
     * Setters
     */
    public void setSideLength(double sideLength) {
        checkParameters(sideLength);
        this.sideLength = sideLength;
    }

    public void setNumberOfSides(int numberOfSides) {
        checkParameters(numberOfSides);
        this.numberOfSides = numberOfSides;
    }

    /**
     * Calcule le périmètre du polygone régulier
     * @return
     */
    public double perimeter() {
        return this.getNumberOfSides() * this.getSideLength();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PolygonRegular polygonRegular)) return false;
        return numberOfSides == polygonRegular.numberOfSides && sideLength == polygonRegular.sideLength;
    }

    @Override
    public String toString() {
        return "<" +
            getNumberOfSides() + " côtés, "+
            getSideLength() +
            " cm>";
    }

    /**
     * Validateurs
     */
    private void checkParameters(int numberOfSides) throws IllegalArgumentException {
        if (numberOfSides < MIN || numberOfSides > MAX_NUMBER_OF_SIDES) {
            throw new IllegalArgumentException("Number of sides must be between " + MIN + " and " + MAX_NUMBER_OF_SIDES);
        }
    }

    private void checkParameters(double sideLength) throws IllegalArgumentException {
        if (sideLength < MIN || sideLength > MAX_SIDE_LENGTH) {
            throw new IllegalArgumentException("Side length must be between " + MIN + " and " + MAX_SIDE_LENGTH);
        }
    }
}
