package src.main.java.com.annaprogramming.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "Blogpost API", version = "1.0", description = "Blogpost open API"))
public class AnnaProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnaProgrammingApplication.class, args);
	}
}
