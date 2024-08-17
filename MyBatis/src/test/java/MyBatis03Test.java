import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import ssy.com.mapper.EmployeeMapper;
import ssy.com.pojo.Employee;
import ssy.com.util.SqlSessionUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class MyBatis03Test {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("empId", 100);
        hashMap.put("empName", "张三");
        hashMap.put("salary", 99.99);
        List<Employee> employees = mapper.selectByCondition(hashMap);
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("empId", 1);
        objectObjectHashMap.put("empName", "张强");
        Integer integer = mapper.updateByCondition(objectObjectHashMap);
        List<Employee> employees1 = mapper.selectByChooseCondition(hashMap);

        for (Employee employee : employees) {
            log.info(employee.toString());
        }
        log.info(integer.toString());
        for (Employee employee : employees1) {
            log.info(employee.toString());
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.selectByForeach(1, 3, 5, 7);
        for (Employee employee : employees) {
            log.info(employee.toString());
        }
//        List<Employee> list = new ArrayList();
//        list.add(new Employee(15,"张三", 99.99));
//        list.add(new Employee(16,"王菲", 98.99));
//        list.add(new Employee(17,"韩寒", 97.99));
//        Integer integer = mapper.insertByForeach(list);
//        log.info(integer.toString());
//        sqlSession.commit();
//        sqlSession.close();
        PageHelper.startPage(1,2);
        List<Employee> employees1 = mapper.selectAllByPage();
        for (Employee employee : employees1) {
            log.info(employee.toString());
        }
    }
}
