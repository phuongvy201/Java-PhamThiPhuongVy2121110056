package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.annotation.MultipartConfig;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class ProductController {
	@Autowired
    ProductRepository productRespository;
	   @GetMapping("/product")
	    public List<Product> index(){
	        return productRespository.findAll();
	    }
	 @PostMapping("/product/search")
	    public List<Product> search(@RequestBody Map<String, String> body){
	        String searchTerm = body.get("text");
	        return productRespository.findByNameContainingOrDescriptionContaining(searchTerm, searchTerm);
	    }
	 @GetMapping("/product/{id}")
	    public ResponseEntity<Product> show(@PathVariable String id) {
	        return ResponseEntity.of(productRespository.findById(Integer.parseInt(id)));
	    }
	 @PostMapping("/product")
	    public Product create(@RequestBody Product product) {
	        return productRespository.save(product);
	    }
	 @PutMapping("/product/{id}")
	    public ResponseEntity<Product> update(@PathVariable String id, @RequestBody Product updatedProduct) {
	        int productId = Integer.parseInt(id);
	        Optional<Product> existingProduct = productRespository.findById(productId);

	        if (existingProduct.isPresent()) {
	            Product product = existingProduct.get();
	            product.setName(updatedProduct.getName());
	            product.setCategory_id(updatedProduct.getCategory_id());
	            product.setDescription(updatedProduct.getDescription());
	            product.setImage(updatedProduct.getImage());
	            product.setStatus(updatedProduct.getStatus());
	            product.setPrice(updatedProduct.getPrice());

	            productRespository.save(product);
	            return ResponseEntity.ok(product);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	  @DeleteMapping("/product/{id}")
	    public ResponseEntity<Void> delete(@PathVariable String id) {
	        int productId = Integer.parseInt(id);
	        Optional<Product> existingProduct = productRespository.findById(productId);

	        if (existingProduct.isPresent()) {
	            productRespository.deleteById(productId);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
}
