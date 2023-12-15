package com.agony.usercenter.service;

import com.agony.usercenter.mapper.StudentMapper;
import com.agony.usercenter.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Agony
 * @Create 2023/11/18 21:23
 * @Version 1.0
 */
@SpringBootTest
class StudentServiceTest {


    @Autowired
    private StudentMapper studentMapper;

    @Test
    void addTest() {
        Student student = new Student();
        // student.setId(0L);
        student.setNAME("asd");
        student.setAge(0);
        student.setEmail("");

        int insert = studentMapper.insert(student);
        System.out.println(student.getId());
    }

    @Test
    void streamTest() {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4);
        numberList.forEach(System.out::println);
        System.out.println("============");
        List<Integer> newList = numberList.stream().map(num -> ++num).toList();
        newList.forEach(System.out::println);
    }
}