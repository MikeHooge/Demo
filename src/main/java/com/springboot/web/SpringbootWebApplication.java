package com.springboot.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.web.domain.Person;

@Controller
@SpringBootApplication
public class SpringbootWebApplication {

	@RequestMapping("/")
	public String index(Model model) {
		Person single = new Person("胡奇", 24);
		List<Person> people = new ArrayList<>();
		people.add(new Person("陶谷请", 24));
		people.add(new Person("黄沅", 24));
		people.add(new Person("洪源", 22));

		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
	
//	@Bean
//	public EmbeddedServletContainerFactory servletContainerFactory(){
//		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory(){
//			@Override
//			protected void postProcessContext(Context context) {
//				SecurityConstraint constraint = new SecurityConstraint();
//				constraint.setUserConstraint("CONFIGDENTIAL");
//				SecurityCollection collection = new SecurityCollection();
//				collection.addPattern("/*");
//				constraint.addCollection(collection);
//				context.addConstraint(constraint);
//			}
//		};
//		tomcat.addAdditionalTomcatConnectors(httpConnector());
//		return tomcat;
//	}
//	
//	@Bean
//	public Connector httpConnector(){
//		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		connector.setScheme("http");
//		connector.setPort(8080);
//		connector.setSecure(false);
//		connector.setRedirectPort(8443);
//		return connector;
//	}
}
