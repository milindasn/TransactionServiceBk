package com.sasianet.transaction_service_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import java.util.TimeZone;

@SpringBootApplication
@EnableCaching
public class TransactionServiceApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TransactionServiceApiApplication.class);
	}
	@Bean
	public HttpTraceRepository httpTraceRepository() {
		return new InMemoryHttpTraceRepository();
	}

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC+05:30"));
		SpringApplication.run(TransactionServiceApiApplication.class, args);
	}

}
