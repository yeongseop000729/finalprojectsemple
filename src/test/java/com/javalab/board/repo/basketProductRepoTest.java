package com.javalab.board.repo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import com.javalab.board.entity.Basket;
import com.javalab.board.entity.BasketProduct;
import com.javalab.board.entity.Product;
import com.javalab.board.repository.BasketProductRepository;
import com.javalab.board.repository.BasketRepository;
import com.javalab.board.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class basketProductRepoTest {
	
	@Autowired
	private BasketProductRepository basketProductRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private BasketRepository basketRepository;
	
	@Test
	@Commit
	public void insertBasketItem() {

		Optional<Basket> basket = basketRepository.findById(1);
		Optional<Product> product = productRepository.findById(1);
		
//		log.info("product : " + product.get());
//		log.info("basket : " + basket.get());
		
		BasketProduct basketProduct = BasketProduct.builder()
				.basketQty(2)
				.basketProductAmount(10000)
				.basket(basket.get())
				.product(product.get())
				.build();
		
		
		basketProductRepository.save(basketProduct);
	}
}
