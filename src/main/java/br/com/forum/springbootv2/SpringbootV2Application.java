package br.com.forum.springbootv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class SpringbootV2Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootV2Application.class, args);
	}

}
