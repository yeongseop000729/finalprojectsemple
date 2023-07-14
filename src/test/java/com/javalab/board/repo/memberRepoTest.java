package com.javalab.board.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import com.javalab.board.entity.Member;
import com.javalab.board.repository.MemberRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class memberRepoTest {

	@Autowired
	private MemberRepository memberRepository;
	
	// 사용자가 회원가입을 했을때 
	@Test
	@Commit
	public void insertMember() {
		
		Member member = Member.builder()
				.memberId("jaewon1336")
				.memberPassword("1234")
				.memberName("이재원")
				.memberAddress("안산시 상록구 일동")
				.memberEmail("email@dot.com")
				.memberPhone("010-1234-5678")
				.build();
		
		memberRepository.save(member);
	}
	
}
