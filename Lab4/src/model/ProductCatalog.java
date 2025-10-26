/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

public class ProductCatalog {
    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        productCatalog = new ArrayList<>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }

    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }

    public Product searchProduct(int id) {
        for (Product p : productCatalog) {
            if (p != null && p.getProductId() == id) {
                return p;
            }
        }
        return null;
    }

    public int getProductCount() {
        return productCatalog.size();
    }
}
