package com.nevado.model;


import com.nevado.persistence.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {
    private final EmployeeRepository repo;

    public Initializer(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
       Employee e=new Employee();
       e.setEmail("sss@gmail.com");
       e.setFullName("test");
       e.setManagerEmail("manger@gmail.com");
       repo.save(e);
    }
}
