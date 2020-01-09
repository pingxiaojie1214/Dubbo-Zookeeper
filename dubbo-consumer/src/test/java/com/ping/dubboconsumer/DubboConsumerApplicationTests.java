package com.ping.dubboconsumer;

import com.ping.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DubboConsumerApplicationTests {
	@Autowired
	private TestService testService;

	@Test
	void contextLoads() {
		testService.test();
	}

}
