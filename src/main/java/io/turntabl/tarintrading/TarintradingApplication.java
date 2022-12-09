package io.turntabl.tarintrading;

import io.turntabl.tarintrading.model.ERole;
import io.turntabl.tarintrading.model.Role;
import io.turntabl.tarintrading.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TarintradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarintradingApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(RoleRepository repository) {
		return args -> {
			repository.save(new Role(ERole.ROLE_USER));
			repository.save(new Role(ERole.ROLE_ADMIN));
			repository.save(new Role(ERole.ROLE_REGULATOR));
		};
	}
}
