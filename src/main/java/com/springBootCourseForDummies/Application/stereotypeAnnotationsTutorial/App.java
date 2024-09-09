package com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial;

import com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.config.AppConfig;
import com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.controller.UserController;
import com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.model.User;
import com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.repository.UserRepository;
import com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //  Fetching Object From IOC Container
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserController controller = context.getBean(UserController.class);
        System.out.println(controller);
        controller.hello();

        UserRepository repository = context.getBean(UserRepository.class);
        System.out.println(repository);
        repository.hello();

        UserService service = context.getBean(UserService.class);
        System.out.println(service);
        service.hello();

        User user = context.getBean(User.class);
        System.out.println(user);
        user.hello();


    }
}
