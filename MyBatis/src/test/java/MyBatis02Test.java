import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import ssy.com.mapper.CustomerMapper;
import ssy.com.mapper.OrdersMapper;
import ssy.com.mapper.StudentMapper;
import ssy.com.pojo.Customer;
import ssy.com.pojo.Orders;
import ssy.com.pojo.Student;
import ssy.com.util.SqlSessionUtil;

import java.util.List;

@Slf4j
public class MyBatis02Test {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        OrdersMapper mapper =    sqlSession.getMapper(OrdersMapper.class);
        Orders orders = mapper.selectOrderAndCustomer(1);
        CustomerMapper mapper1 = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = mapper1.selectCustomerAndOrder(1);
        StudentMapper mapper2 = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper2.selectAllStudentsAndTeacher();
        for (Student student : students) {
            log.info(student.toString());
        }
        log.info(orders.toString());
        log.info(customer.toString());

        sqlSession.close();
    }

}
