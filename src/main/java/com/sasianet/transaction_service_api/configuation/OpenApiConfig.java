package com.sasianet.transaction_service_api.configuation;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI serviceApi(){
        return new OpenAPI()
                .info(new Info().title("Transaction Service")
                        .description("Rest API for Transactions")
                        .version("V 2.0.0")
                        .license(new License().name("Sasianet Pvt Ltd")));
    }
}
