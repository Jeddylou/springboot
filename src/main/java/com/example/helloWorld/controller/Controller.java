package com.example.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：louzhengjie
 * @date ：Created in 2020/9/2 3:25 下午
 */

@RestController
@RequestMapping("/test")
public class Controller {
    @GetMapping("/hello")
    public String SayHello() {
        return "Hello World";
    }


    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        System.out.println("数组的容量" + ":" + getLength(list));
        System.out.println("size" + ":" + list.size());
        List<Integer> list1 = new ArrayList<>(10);
        System.out.println("数组的容量" + ":" + getLength(list1));
        System.out.println("size" + ":" + list1.size());
        list.add(1);
        System.out.println("执行add后数组的容量" + ":" + getLength(list));
        System.out.println("size" + ":" + list.size());
        list1.add(1);
        System.out.println("执行add后数组的容量" + ":" + getLength(list1));
        System.out.println("size" + ":" + list1.size());
        List<Integer> list3 = new LinkedList<>();
    }

    private static int getLength(List<Integer> list) throws Exception {
        Field field = list.getClass().getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] objects = (Object[]) field.get(list);
        return objects.length;
    }

}
