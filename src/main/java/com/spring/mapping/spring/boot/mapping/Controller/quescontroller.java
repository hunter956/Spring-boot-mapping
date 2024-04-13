package com.spring.mapping.spring.boot.mapping.Controller;

import com.spring.mapping.spring.boot.mapping.Services.Impl.QuesServicesImpl;
import com.spring.mapping.spring.boot.mapping.entity.Ans;
import com.spring.mapping.spring.boot.mapping.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class quescontroller {
    @Autowired
    QuesServicesImpl quesservicesimpl;
    @PostMapping("/ques")
    public Question addques(@RequestBody Question question){
       Question q= quesservicesimpl.addquestion(question);
        return q;
    }

    @PostMapping("/ans")
    public Ans addans(@RequestBody Ans ans){
        Ans Answwer= quesservicesimpl.addanswer(ans);
        return Answwer;
    }



}
