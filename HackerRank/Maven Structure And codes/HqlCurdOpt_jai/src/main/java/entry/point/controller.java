package entry.point;

import java.util.List;

import model.classes.Product;
import product.services.ProductServiceImpl;
import product.services.ProductServices;

public class controller {
	public static ProductServices service = new ProductServiceImpl();
	public static void main(String[] args) {
		List<Product> list = service.getAllProductInfo();
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
