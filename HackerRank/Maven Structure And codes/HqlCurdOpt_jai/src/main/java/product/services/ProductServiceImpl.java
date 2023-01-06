package product.services;

import java.util.List;

import dao.Operation.ProductDao;
import dao.Operation.ProductDaoImpl;
import model.classes.Product;

public class ProductServiceImpl implements ProductServices {
	
	private ProductDao productDao = null;

	public ProductServiceImpl() {
		this.productDao = new ProductDaoImpl();
	}

	public List<Product> getAllProductInfo() {
		return this.productDao.getAllProductInfo();
	}

	public List<Product> getAllProductInfo(Double lessThanPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object[]> getFewColumnInfo() {
		return this.productDao.getFewColoumInfo();
	}

	public List<String> getAllProductsName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateAllProductPrice(Integer percentage) {
		return this.productDao.updateAllProductPrice(percentage);
	}

	public Integer deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer insertNewProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
