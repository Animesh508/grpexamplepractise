package dao.Operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.classes.Product;
import util.classes.controllerGetSessionFactory;


public class ProductDaoImpl implements ProductDao {
	private SessionFactory factory;
	
	public ProductDaoImpl() {
		this.factory = controllerGetSessionFactory.controllergetSessionFactoryInstance();
	}
	public List<Product> getAllProductInfo(){
		Session session = factory.openSession();
		Query<Product> query = session.createQuery("from product");
		List<Product> productList = query.list();
		return productList;		
	}
	
	public List<Product> getProductsInfo(Double lessThanPrice){
		Session session = factory.openSession();
		Query<Product> query = session.createQuery("from product p where p.productprice <=:price ");
		query.setParameter("price", lessThanPrice);
		List<Product> productList = query.list();
		session.close();
		return productList;
	}
	public List<Object[]> getFewColoumInfo(){
		Session session = factory.openSession();
		Query<Object[]> query = session.createQuery("select p.productName, p.productPrice from Product p");
		List<Object[]> objectArr = query.list();
		return objectArr;
	}
	public List<String> getProductName(){
		Session session =factory.openSession();
		Query<String> query = session.createQuery("select p.productName from Product");
		List<String> listOfProductName = query.list();
		return listOfProductName;
	}
	public Integer updateAllProductPrice(Integer discount) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query<Product> query = session.createQuery("form Product");
		List<Product> productList = query.list();
		for (Product product : productList) {
			Double price = product.getProductPrice();
			Double updatedPrice = (price-price*(10.0/100.0));
			System.out.println(">>"+ updatedPrice);
			product.setProductPrice(updatedPrice);
			}
		tx.commit();
		session.close();
		updateObject(productList);
		return null;
	}
	private void updateObject(List<Product> productList) {
		for (Product product : productList) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(product);
			tx.commit();
			session.close();
		}
		
	}
	public Integer deleteProduct(Integer productId) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query<Integer> query = session.createQuery("delete Product p where p.productId =:pId");
		int updateRows = query.executeUpdate();
		tx.commit();
		session.close();
		return updateRows;
	}
	public 	Integer insertNewProduct(Product product) {
		
		return null;
	}
	
	
}
