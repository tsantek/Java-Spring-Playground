package com.galvanize.playground;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest(HelloController.class)
public class PlaygroundApplicationTests {

	@Autowired
	MockMvc mvc;


	@Test
	public void testHomePage() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/");
		this.mvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string(("Hello")));
	}

	@Test
	public void testProfile() throws Exception {
		RequestBuilder requestProfile = MockMvcRequestBuilders.get("/profile");
		this.mvc.perform(requestProfile)
				.andExpect(status().isOk())
				.andExpect(content().string(("Profile")));
	}




}
