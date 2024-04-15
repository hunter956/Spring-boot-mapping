package com.spring.mapping.spring.boot.mapping.Repository;

import com.spring.mapping.spring.boot.mapping.entity.Ans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AnsRepository extends JpaRepository<Ans,Integer> {

}
