package bm.memorydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@ComponentScan
@EnableAutoConfiguration
//@EnableDiscoveryClient
@SpringBootApplication
@EnableDiscoveryClient
public class MemoryDemoApplication {

//	@Autowired
//	ServerHttpSecurity httpSecurity;
	
//	@Bean
//	public SecurityWebFilterChain securityWebFilterChain(
//	  ServerHttpSecurity http) {
//	    return http.authorizeExchange()
//	      .pathMatchers("/actuator/**").permitAll()
//	      .anyExchange().authenticated()
//	      .and().build();
//	}

	public static void main(String[] args) {
		SpringApplication.run(MemoryDemoApplication.class, args);
	}

}
