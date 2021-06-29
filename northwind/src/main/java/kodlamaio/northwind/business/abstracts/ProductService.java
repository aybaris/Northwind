package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();

	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	
	DataResult<List<Product>> getAllSorted ();
	
	Result add(Product product); 

	DataResult<Product> getByProductName(String productName);

	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId); // and denildiği için ikisine de																					// uyulacak

	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId); // or kullanıldığı için ikisinden
																					// birisine bakacak
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);// id'ye göre getirme

	DataResult<List<Product>> getByProductNameContains(String productName); // ürün ismine göre arama

	DataResult<List<Product>> getByProductNameStartsWith(String productName); // ürün ismine şununla başlayan gibi fonklar

	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
}
