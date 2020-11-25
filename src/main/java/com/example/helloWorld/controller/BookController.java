package com.example.helloWorld.controller;

import com.alibaba.fastjson.JSON;
import com.example.helloWorld.entity.Book;
import com.example.helloWorld.entity.DateDTO;
import com.example.helloWorld.handle.RepeatSubmit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：louzhengjie
 * @date ：Created in 2020/9/2 3:58 下午
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class BookController {

    private List<Book> books = new ArrayList<>();

    @RepeatSubmit
    @PostMapping("/book")
    public ResponseEntity<List<Book>> addBook(@RequestBody Book book) {
        books.add(book);
        log.info("123");
        return ResponseEntity.ok(books);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity deleteBookById(@PathVariable("id") int id) {
        books.remove(id);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/book")
    public ResponseEntity getBookByName(@RequestParam("name") String name) {
        List<Book> results = books.stream().filter(book -> book.getName().equals(name)).collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }

    @GetMapping("/date")
    public ResponseEntity getDate() {
//        int i = 1 / 0;
        DateDTO dateDTO = new DateDTO();
        dateDTO.setThisDay(new Date());
        return ResponseEntity.ok(dateDTO);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(200);
        list.add(5);
        System.out.println(JSON.toJSON(list));
        String s = null;
    }


}
