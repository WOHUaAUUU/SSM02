package ssy.com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ssy.com.pojo.OrderInfo;

import java.util.List;

@Mapper
public interface OrderInfoMapper {
    List<OrderInfo> selectBY(String date);
}
