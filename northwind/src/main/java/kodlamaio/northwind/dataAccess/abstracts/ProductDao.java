package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId); // and denildiği için ikisine de uyulacak
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId); // or kullanıldığı için ikisinden birisine bakacak
	
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);//id'ye göre getirme
	
	List<Product> getByProductNameContains(String productName); //ürün ismine göre arama

	List<Product> getByProductNameStartsWith(String productName); //ürün ismine şununla başlayan gibi fonklar
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")//JPQL YAZIMI
	List<Product> getByNameAndCategory(String productName, int categoryId);
	
}
