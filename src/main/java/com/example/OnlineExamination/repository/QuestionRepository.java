package com.example.OnlineExamination.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineExamination.entity.Question;

public interface QuestionRepository 
        extends JpaRepository<Question,Integer> {
}
