package com.javalab.board.repo;

import java.util.List;

import javax.persistence.CascadeType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import com.javalab.board.entity.Category;
import com.javalab.board.entity.Product;
import com.javalab.board.repository.CategoryRepository;
import com.javalab.board.repository.ProductRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class categoryRepoTest {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
//	@Test
	@Commit
	public void inserstCategory() {
		
//		List<Product> products = productRepository.findAll();
//		
//		System.out.println("products : " + products);
		
		Category category = Category.builder()
				.categoryName("전자제품")
				.build();
		
		categoryRepository.save(category);
	}
	
	// cascade = CascadeType.ALL 이여서 해당 카테고리 product도 다 삭제됨
	@Test
	@Commit
	public void deleteCategory() {
		categoryRepository.deleteById(1);
	}

}
