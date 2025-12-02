/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author ornellabajou
 */
public class Supplier {
    private String supplierName;
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;
    
    public Supplier() {
        this.productCatalog = new ProductCatalog();
    }
     
    public Supplier(String supplierName) {
        this.supplierName = supplierName;
        this.productCatalog = new ProductCatalog();
    }
     
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    @Override 
    public String toString (){
        return supplierName;
    }
    
}
