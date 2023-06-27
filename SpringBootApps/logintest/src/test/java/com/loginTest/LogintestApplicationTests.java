package com.loginTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.loginTest.Model.Register;
import com.loginTest.Service.RegisterServiceImpl;

@SpringBootTest
class LogintestApplicationTests {

	@Autowired
	private RegisterServiceImpl regServiceImpl;

	@Test
	void contextLoads() {
	}

	@Test
	void testTotalUserNegative() {
		List<Register> user = regServiceImpl.ShowAll();

		Integer count = 0;
		for (Register u : user) {
			count++;
		}

		assertNotEquals(0, count);
	}

	@Test
	void testTotalUser() {
		List<Register> user = regServiceImpl.ShowAll();

		Integer count = 0;
		for (Register u : user) {
			count++;
		}

		assertEquals(3, count);
	}

	void checkAllUser() {
		List<Register> user = regServiceImpl.ShowAll();

		for (Register u : user) {
			assertNotNull(u);
		}
	}

}
