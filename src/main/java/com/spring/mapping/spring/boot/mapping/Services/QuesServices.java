package com.spring.mapping.spring.boot.mapping.Services;

import com.spring.mapping.spring.boot.mapping.entity.Ans;
import com.spring.mapping.spring.boot.mapping.entity.Question;

public interface QuesServices {
   public Question addquestion(Question question);


   public Ans addanswer(Ans ans);
}
