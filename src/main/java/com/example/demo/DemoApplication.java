package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.entity.Student;
import com.example.repo.StudentRepo;

@SpringBootApplication
@ComponentScan({"com.example.repo.StudentRepo"})
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student s1 = new Student("haikal","Tangerang","haikal@asprak.com");
		Student s2 = new Student("farrel","Semarang","farrel@asprak.com");
		Student s3 = new Student("budi","Bogor","budi@asprak.com");
		Student s4 = new Student("didit","Depok","didit@asprak.com");

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);

	}

}

