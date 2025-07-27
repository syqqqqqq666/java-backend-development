package com.example.springioc.component;

import com.example.springioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class StudentComponent {

    @Bean
    public Student s1()
    {
        return new Student("1",11);
    }
    //有参数
    @Bean
    private String name(){
        return "student";
    }
    @Bean
    private String name1(){
        return "student1";
    }
    //spring会去容器中寻找String类型的bean对象,在两个不同的类中定义相同的name()
    //哪怕没调用也会报错
    @Bean
    public Student s2(String name){
        return new Student(name,11);
    }
    @Bean
    public Student s3(){
        return new Student("2",22);
    }
    @Bean
    public Student s4(Student s3){
        return s3;
    }


}
