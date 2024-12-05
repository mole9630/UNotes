package dao;

import bean.Product;
import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM product");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Product product = new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price")
                );
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    public Product getProductById(int id) {
        Product product = null;
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM product WHERE id = ?")) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                product = new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public void addProduct(Product product) {
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO product (name, price) VALUES (?, ?)")) {

            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getPrice());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProduct(Product product) {
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE product SET name = ?, price = ? WHERE id = ?")) {

            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getPrice());
            stmt.setInt(3, product.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProduct(int id) {
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM product WHERE id = ?")) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
