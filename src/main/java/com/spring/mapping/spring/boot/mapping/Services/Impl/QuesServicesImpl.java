package com.spring.mapping.spring.boot.mapping.Services.Impl;

import com.spring.mapping.spring.boot.mapping.Repository.AnsRepository;
import com.spring.mapping.spring.boot.mapping.Repository.QuesRepository;
import com.spring.mapping.spring.boot.mapping.entity.Ans;
import com.spring.mapping.spring.boot.mapping.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
