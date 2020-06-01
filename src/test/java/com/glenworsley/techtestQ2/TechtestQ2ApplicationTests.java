package com.glenworsley.techtestQ2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TechtestQ2ApplicationTests {

	@Autowired
	MyAppController myAppController;

	@Autowired
	PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer;

	@Autowired
	AppInfoBuilder appInfoBuilder;

	@Test
	void contextLoads() {

		assertNotNull(myAppController);
		assertNotNull(propertySourcesPlaceholderConfigurer);
		assertNotNull(appInfoBuilder);
		assertNotNull(myAppController.getAppInfoBuilder());

	}

}
