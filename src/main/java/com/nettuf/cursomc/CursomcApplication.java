package com.nettuf.cursomc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	//@Autowired
	//private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	s3Service.uploadFile("C:\\Users\\Netto Fernandes DEV\\OneDrive\\Imagens\\teste.jpg");
		
	}

}
