package ubilapaz.edu.bo.clasetallerex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClaseTallerexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaseTallerexApplication.class, args);
	}
	@Bean
	public String saluda(){
		System.out.println("hola mundo");
		return "";
	}

}
