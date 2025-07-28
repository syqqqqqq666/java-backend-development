package com.example;

import com.example.springioc.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIocApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext= SpringApplication.run(SpringIocApplication.class, args);
/*
        //ioc容器中拿出对象
        HelloController helloController=  applicationContext.getBean(HelloController.class);
        helloController.print();
        //原本
        HelloController helloController2 =new HelloController();
        helloController2.print();
        */
       // 根据名称拿出
//       HelloController controller= (HelloController) applicationContext.getBean("helloController");
//       controller.print();

        //bean
        Student student = (Student) applicationContext.getBean("s4");
        System.out.println(student);

    }

}
