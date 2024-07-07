package com.ssm.jdbc.tx.Service;

import com.ssm.jdbc.tx.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
//开启事务的注解
    @Transactional
    public void changeInfo(){
       studentDao.UpdateAgeById(20,1);
        System.out.println("-------------------------");
        studentDao.UpdateNameById("小哈哈",2);
    }
}