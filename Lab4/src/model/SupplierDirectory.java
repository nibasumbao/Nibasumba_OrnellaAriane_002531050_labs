/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ornellabajou
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory() {
        supplierList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    
    public Supplier addSupplier(String supplierName) {
        Supplier s = new Supplier(supplierName);
        supplierList.add(s);
        return s;
    }

    
    public Supplier addSupplier() {
        Supplier s = new Supplier();
        s.setProductCatalog(new ProductCatalog());   // initialize product catalog
        supplierList.add(s);
        return s;
    }

    public void removeSupplier(Supplier s) {
        supplierList.remove(s);
    }

    public Supplier searchSupplier(String keyWord) {
        for (Supplier s : supplierList) {
            if (s.getSupplierName() != null && s.getSupplierName().equalsIgnoreCase(keyWord)) {
                return s;
            }
        }
        return null;
    }
}
