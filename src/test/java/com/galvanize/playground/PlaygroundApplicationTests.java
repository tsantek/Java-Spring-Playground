package com.galvanize.playground;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

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

	@Test
	public  void  testMathPi() throws Exception {
		RequestBuilder requestMathPi = MockMvcRequestBuilders.get("/math/pi");
		this.mvc.perform(requestMathPi)
				.andExpect(status().isOk())
				.andExpect(content().string(( "The volume of a 6x7x8 rectangle is 336")));
	}


	@Test
	public  void  testVolume() throws Exception {
		RequestBuilder requestVolume = MockMvcRequestBuilders.get("/math/volume/6/7/8\"");
		this.mvc.perform(requestVolume)
				.andExpect(status().isOk())
				.andExpect(content().string(("3.141592653589793")));
	}





}
