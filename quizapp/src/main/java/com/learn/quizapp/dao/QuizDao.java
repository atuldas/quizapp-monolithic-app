package com.learn.quizapp.dao;

import com.learn.quizapp.model.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
