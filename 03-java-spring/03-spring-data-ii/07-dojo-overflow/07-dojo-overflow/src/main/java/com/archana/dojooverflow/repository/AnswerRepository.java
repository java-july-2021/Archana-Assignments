package com.archana.dojooverflow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.archana.dojooverflow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository <Answer,Long>{

}
