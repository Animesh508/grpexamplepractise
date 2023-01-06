package dao.Operation;

import java.util.List;
import model.classes.Product;

public interface ProductDao {
	List<Product> getAllProductInfo();
	List<Product> getProductsInfo(Double lessThanPrice);
	List<Object[]> getFewColoumInfo();
	List<String> getProductName();
	Integer updateAllProductPrice(Integer discount);
	Integer deleteProduct(Integer productId);
	Integer insertNewProduct(Product product);
	

}
