package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	
	 DataResult<List<Product>> getAll();
	 
	 DataResult<List<Product>> getAllSorted();
	 
	 Result add(Product product);

	 DataResult<Product> getByProductName(String productName);
	 
	 DataResult<Product> getByProductNameAndCategory(String productName,int categoryId);
	 
	 DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	 
	 DataResult<List<Product>> getByProductNameContains(String productName);
	 
	 DataResult<List<Product>> getByProductNameStartWith(String productName);
	 
	 DataResult<List<Product>> getByNameAndCategory(String productName, String categoryId);
	 DataResult<List<ProductWithCategoryDto>>  getProductWithCategoryDetails();
	 
}