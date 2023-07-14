//package com.javalab.board.repo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Commit;
//
//import com.javalab.board.entity.Admin;
//import com.javalab.board.repository.AdminRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class adminRepoTest {
//	
//	@Autowired
//	private AdminRepository adminRepository;
//	
//	
//	@Test
//	@Commit
//	public void insertAdmin() {
//		Admin admin = Admin.builder()
//				.adminId("admin2")
//				.adminPassword("1234")
//				.adminName("어드민2")
//				.build();
//
//		adminRepository.save(admin);
//		
//	}
//	
//	
//
//}
