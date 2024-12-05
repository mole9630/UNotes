package service;

import bean.Product;
import dao.ProductDAO;

import java.util.List;

public class ProductService {
    private ProductDAO productDAO;

    public ProductService() {
        productDAO = new ProductDAO();
    }

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public Product getProductById(int id) {
        return productDAO.getProductById(id);
    }

    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    public void updateProduct(Product product) {
        productDAO.updateProduct(product);
    }

    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
}
