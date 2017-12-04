package core.model;


import core.model.base.BaseProduct;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Product extends BaseProduct<Product> {
    public static final Product dao = new Product().dao();

    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Product{} " + super.toString();
    }
}