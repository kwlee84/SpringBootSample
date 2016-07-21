package sk.test;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {
		"sk.test.cp",
})
public class TestServiceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TestServiceApplication.class);
    }

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//
		SpringApplication.run(TestServiceApplication.class, args);
	}
	
}
