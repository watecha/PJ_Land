package idv.demo.watepay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@ComponentScan(basePackages = { "idv.demo.watepay.model, idv.demo.watepay.controller, idv.demo.watepay.service, idv.demo.watepay.aop" }) // <-- here
public class WatepayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatepayApplication.class, args);
	}

}


