package com.ssm.jdbc.tx.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//标记Dao，该层进行数据库增删改查业务的编写
@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void UpdateNameById(String name, Integer  id) {
        String sql="update students set name=? where id=?";
        int update = jdbcTemplate.update(sql, name, id);
        System.out.printf("update %d rows",update);
    }
    public void UpdateAgeById(Integer age, Integer  id) {
        String sql="update students set age=? where id=?";
        int update = jdbcTemplate.update(sql, age, id);
        System.out.printf("update %d rows",update);
    }
}
