package ssy.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssy.com.mapper.OrderInfoMapper;
import ssy.com.pojo.OrderInfo;
import ssy.com.service.OrderInfoService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderInfoService{
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Override
    public void sendMessage(String date) {
        List<OrderInfo> orderInfos = orderInfoMapper.selectBY(date);
        for (OrderInfo orderInfo : orderInfos) {
            System.out.println(orderInfo.getOrderId()+"\t"+orderInfo.getReserveDate());
        }
    }
}
