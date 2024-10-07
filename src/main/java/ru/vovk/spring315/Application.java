package ru.vovk.spring315;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.vovk.spring315.model.UserEntity;
import ru.vovk.spring315.service.UserService;

@SpringBootApplication
@AllArgsConstructor
public class Application implements CommandLineRunner {
    private UserService service;
    private static String finalCode;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        System.out.println(finalCode);
    }

    @Override
    public void run(String... args) {
        service.getAllUsers();
        finalCode =
                service.addUser(
                                new UserEntity(3L, "James", "Brown", (byte) 30))
                        .getBody();
        finalCode +=
                service.updateUser(
                                new UserEntity(3L, "Thomas", "Shelby", (byte) 30))
                        .getBody();
        finalCode +=
                service.deleteUser(3L)
                        .getBody();
    }
}