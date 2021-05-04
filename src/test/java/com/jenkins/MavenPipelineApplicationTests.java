package com.jenkins;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class MavenPipelineApplicationTests {

	@InjectMocks
	TestController underTest;
	@Test
	void contextLoads() {
		String str = underTest.test();
		System.out.println(str);
		Assert.assertEquals(str,
				"<h1 align='center' style='color:red'>This is Testing website Successfully Launched</h1>");
		
	}

}
