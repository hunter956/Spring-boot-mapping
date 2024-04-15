package com.spring.mapping.spring.boot.mapping.Services.Impl;

import com.spring.mapping.spring.boot.mapping.Repository.AnsRepository;
import com.spring.mapping.spring.boot.mapping.Repository.QuesRepository;
import com.spring.mapping.spring.boot.mapping.entity.Ans;
import com.spring.mapping.spring.boot.mapping.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuesServicesImpl implements com.spring.mapping.spring.boot.mapping.Services.QuesServices {
    @Autowired
    QuesRepository quesRepository;
    @Autowired
    AnsRepository ansRepository;

    @Override
    public Question addquestion(Question question) {
        quesRepository.save(question);


        return question;
    }

    @Override
    public Ans addanswer(Ans ans) {
       ansRepository.save(ans);
       return ans;
    }

    @Override
    public Integer delete(Integer id) {
       Integer i= quesRepository.deleteQuestionById(id);
        return i;

    }

    @Override
    public List<Question> getall() {
      return quesRepository.findAll();
    }

    @Override
    public List<Ans> getallans() {
        return ansRepository.findAll();
    }


}
