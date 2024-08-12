import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
public class MyBatisTest {
    @Test
    public void test() throws IOException {

        // 获取SqlSession实例
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
// 获取EmployeeMapper实例
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
// 查询所有员工
        List<Employee> employees = mapper.selectAll();
        Employee byId = mapper.selectById(1);
//        Integer insert = mapper.insert(new Employee(null, "王麻子", 30.47));
//        Integer update = mapper.update(1, 99.99);
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "张三");
        List<Employee> employees1 = mapper.selectByIdAndName(map);
        Integer integer = mapper.selectCount();

        Map<String, Object> stringObjectMap = mapper.selectByMap();
        Set<Map.Entry<String, Object>> entries = stringObjectMap.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            log.info("key = {}, value = {}", entry.getKey(), entry.getValue());
        }
// 遍历员工列表，打印员工信息
//        employees.forEach(System.out::println);;
        log.info("employees = {}", employees);
        log.info("byId = {}", byId);
//        log.info(insert.toString());
//        log.info(update.toString());
        for (Employee employee : employees1) {
            log.info(employee.toString());
        }
        log.info(integer.toString());
// 关闭SqlSession
        sqlSession.commit();
        sqlSession.close();
    }
}
