package com.spring.mapping.spring.boot.mapping.Controller;

import com.spring.mapping.spring.boot.mapping.Services.Impl.QuesServicesImpl;
import com.spring.mapping.spring.boot.mapping.entity.Ans;
import com.spring.mapping.spring.boot.mapping.entity.Question;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/del/{id}")
    public ResponseEntity<?> delete(@PathVariable int id)
    {
       Integer i= quesservicesimpl.delete(id);
      return   ResponseEntity.status(HttpStatus.ACCEPTED).body(i);
    }

   @GetMapping("/allques")
   public ResponseEntity<List<Question>> getallques()
   {
       List<Question> getall = quesservicesimpl.getall();
       return ResponseEntity.status(HttpStatus.CREATED).body(getall);
   }

    @GetMapping("/allans")
    public ResponseEntity<List<Ans>> getallans()
    {
        List<Ans> getallans = quesservicesimpl.getallans();
        return ResponseEntity.status(HttpStatus.CREATED).body(getallans);
    }

    @PostConstruct
    public Question invokeato()
    {
        Question q=new Question();
        q.setQuestion("What is AI?");
        quesservicesimpl.addquestion(q);
       return q;
    }

}
