package com.javalab.board.repo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

//import com.javalab.board.entity.Admin;
import com.javalab.board.entity.Category;
import com.javalab.board.entity.Member;
import com.javalab.board.entity.Product;
//import com.javalab.board.repository.AdminRepository;
import com.javalab.board.repository.CategoryRepository;
import com.javalab.board.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Builder;
//import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Slf4j
public class productRepoTest {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
//	@Autowired 
//	private AdminRepository adminRepository;
	
	@Test
	@Commit
	public void insertProduct() {
		
		
		Optional<Category> category = categoryRepository.findByCategoryNo(1);
//		Optional<Admin> admin = adminRepository.findById("admin2");
		
		log.info("category : " + category.get());
//		log.info("admin : " + admin.get());
		
		Product product = Product.builder()
				.productName("컴퓨터")
				.productDescription("컴퓨터 입니다.")
				.productPrice(3500000)
//				.productQty(2)
//				.productUpdated(LocalDate.now())
//				.admin(admin.get())
				.category(category.get())
				.build();
		
		productRepository.save(product);
	}
	
	 private static final Logger log = LoggerFactory.getLogger(CategoryRepository.class);
	
}
