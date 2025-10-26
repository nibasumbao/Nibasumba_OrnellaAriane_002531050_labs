/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Supplier;
import java.util.ArrayList;

/**
 *
 * @author ornellabajou
 */
public class Product {
    private String productName;
    private double price;
    private int productId;
    
     private ArrayList<Feature> features;   

    private static int count = 0;          

    
    public Product() {
        count++;
        productId = count;
        features = new ArrayList<>();    
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;   
    }

    // Add new Feature
    public Feature addNewFeature() {
    Feature f = new Feature(this);   // pass this Product as the owner
    features.add(f);
    return f;
    }
@Override
    public String toString() {
        return productName + " ($" + price + ")";
    }
  

   
}
