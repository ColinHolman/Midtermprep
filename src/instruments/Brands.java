/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruments;

/**
 *
 * @author Colin
 */
public enum Brands {
    
    DINGWALL("Dingwall", 2499.00),
    WARWICK("Warwick", 1700.98),
    MUSICMAN("Music Man", 2400.99),
    FENDER("Fender", 700.76),
    YAMAHA("Yamaha", 750.90);
    
    private String name;
    private double cost;

    private Brands(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }
    
    public String toString()
    {
        return String.format("Guitar Pricing: %s %f", name, cost);
    }

    
    
}
