package idv.demo.watepay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class WatepayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatepayApplication.class, args);
	}

}


