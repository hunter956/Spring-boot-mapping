package com.spring.mapping.spring.boot.mapping.Repository;

import com.spring.mapping.spring.boot.mapping.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface QuesRepository extends JpaRepository<Question, Integer> {
   @Transactional
    public Integer deleteQuestionById(Integer id);

}
