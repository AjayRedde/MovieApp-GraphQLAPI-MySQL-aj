package a_aa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication (scanBasePackages = "a_controller" + "client" + "dto")
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
