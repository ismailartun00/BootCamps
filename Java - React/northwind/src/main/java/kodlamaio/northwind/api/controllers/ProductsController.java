package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController // controllersın dedik.
@RequestMapping("/api/products") // eğer domaimize ek olarak bu adres girilirse burası karşılayacak diyoruz.
public class ProductsController {

	private ProductService productService;

	@Autowired // parametre tipine bakarak projeyi tarıyor ve bu parametreyi implemente eden class'ı bulup onu new'liyor.
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") // GetMapping veri istiyoruz demek ve api/products/'dan sonra /getall dersek bu metot çalışacak.
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		
		return this.productService.add(product);
	}
}
