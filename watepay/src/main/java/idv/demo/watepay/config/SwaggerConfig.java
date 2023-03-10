package idv.demo.watepay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()

                .title("HAPPYGO Pay API")
                .description("提供HAPPYGO Pay API的模擬串接及規格說明")
                .version("1.0.0")
                //.license("Apache 2.0")
                //.contact(new Contact("XYZ", "XYZ.com", "XYZ@gmail.com"))
                //.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }

}
