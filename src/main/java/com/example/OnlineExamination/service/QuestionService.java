package com.example.OnlineExamination.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineExamination.entity.Question;
import com.example.OnlineExamination.repository.QuestionRepository;


@Service
public class QuestionService {

    @Autowired
    private QuestionRepository repo;

    // CREATE
    public Question save(Question q){
        return repo.save(q);
    }

    // READ ALL
    public List<Question> getAll(){
        return repo.findAll();
    }

    // READ BY ID
    public Question getById(int id){
        return repo.findById(id).orElse(null);
    }

    // UPDATE
    public Question update(int id, Question newQ){
        Question old = repo.findById(id).orElse(null);

        if(old!=null){
            old.setQuestion(newQ.getQuestion());
            old.setOptionA(newQ.getOptionA());
            old.setOptionB(newQ.getOptionB());
            old.setOptionC(newQ.getOptionC());
            old.setOptionD(newQ.getOptionD());
            old.setAnswer(newQ.getAnswer());
            return repo.save(old);
        }
        return null;
    }

    // DELETE
    public String delete(int id){
        repo.deleteById(id);
        return "Question deleted";
    }
}
