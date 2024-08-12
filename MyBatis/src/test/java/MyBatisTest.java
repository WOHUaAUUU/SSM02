import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import ssy.com.mapper.EmployeeMapper;
import ssy.com.pojo.Employee;
import ssy.com.util.SqlSessionUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void test() throws IOException {

        // 获取SqlSession实例
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
// 获取EmployeeMapper实例
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
// 查询所有员工
        List<Employee> employees = mapper.selectAll();
// 遍历员工列表，打印员工信息
        employees.forEach(System.out::println);;
// 关闭SqlSession
        sqlSession.close();
    }
}
