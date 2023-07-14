package com.javalab.board.repo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import com.javalab.board.entity.Basket;
import com.javalab.board.entity.Member;
import com.javalab.board.repository.BasketRepository;
import com.javalab.board.repository.MemberRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class basketRepoTest {
	
	@Autowired
	private BasketRepository basketRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	
	// 사용자가 장바구니에 상품을 담았을때 우선 생성되는 행
	@Test
	@Commit
	public void createBasket() {
		int amount = 5000;
		BigDecimal amountBigDecimal = new BigDecimal(amount);

		Member member = memberRepository.findById("jaewon1336").orElse(null);
		
		Basket basket = Basket.builder()
//				.basketAmount(5000)
				.member(member)
				.build();
		
		basketRepository.save(basket);
	}
	

}
