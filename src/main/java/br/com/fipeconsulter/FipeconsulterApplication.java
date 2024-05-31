package br.com.fipeconsulter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fipeconsulter.main.MainMenu;

@SpringBootApplication
public class FipeconsulterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FipeconsulterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		new MainMenu().showMenu();

	}
}
