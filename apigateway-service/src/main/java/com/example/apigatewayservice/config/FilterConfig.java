package com.example.apigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterConfig {

    /**
     * application.yml에서 수행하는 것 대신 해당 클래스에서 작업하는 것이다
     * @param builder
     * @return
     */

//    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(r -> r.path("/first-service/**") //여기로 요청 들어오면

                //request/response filter 에는 각각의 key value 값을 등록하고
                .filters(f -> f.addRequestHeader("first-request", "first-request-header")
                                                .addResponseHeader("first-response", "first-response-header"))

                .uri("http://localhost:8081")) //해당 경로로 이동한다

            //위 첫번째 route 등록한 것과 동일하다
            .route(r -> r.path("/second-service/**")

                    .filters(f -> f.addRequestHeader("second-request", "second-request-header")
                                                    .addResponseHeader("second-response", "second-response-header"))

                    .uri("http://localhost:8082"))

            .build();
    }
}
