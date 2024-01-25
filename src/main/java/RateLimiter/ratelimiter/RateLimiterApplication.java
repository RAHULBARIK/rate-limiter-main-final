package RateLimiter.ratelimiter;


import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"RateLimiter.ratelimiter.util","RateLimiter.ratelimiter.controller","RateLimiter.ratelimiter.service"})
@OpenAPIDefinition(
		info = @Info(
				title = "Health Check API with function logging Documentation",
				description = "This Application monitors the health of the application and logs how many times the healthCheck function is invoked",
				version = "v1.0",
				contact = @Contact(
						name = "Ravi",
						email = "ravi@fairdeal.market",
						url = "https://www.fairdeal.market/"
				),
				license = @License(
						name = "FairDeal 2.0",
						url = "https://www.fairdeal.market/"
				)


		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Health Check Api documentation",
				url = "https://www.fairdeal.market/"
		)
)
public class RateLimiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateLimiterApplication.class, args);
	}

}
