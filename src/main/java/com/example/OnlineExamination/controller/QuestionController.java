package com.example.OnlineExamination.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.OnlineExamination.entity.Question;
import com.example.OnlineExamination.service.QuestionService;


@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService service;

    // CREATE
    @PostMapping("/add")
    public Question add(@RequestBody Question q){
        return service.save(q);
    }

    // GET ALL
    @GetMapping("/all")
    public List<Question> all(){
        return service.getAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Question get(@PathVariable int id){
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Question update(@PathVariable int id,
                           @RequestBody Question q){
        return service.update(id,q);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }
}
