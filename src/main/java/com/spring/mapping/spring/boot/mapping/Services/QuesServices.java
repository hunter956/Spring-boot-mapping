package com.spring.mapping.spring.boot.mapping.Services;

import com.spring.mapping.spring.boot.mapping.entity.Ans;
import com.spring.mapping.spring.boot.mapping.entity.Question;

import java.util.List;

public interface QuesServices {
   public Question addquestion(Question question);


   public Ans addanswer(Ans ans);


   public Integer delete(Integer id);

   public List<Question> getall();

   public List<Ans> getallans();
}
