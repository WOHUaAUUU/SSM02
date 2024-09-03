package ssy.com.task;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ssy.com.service.OrderInfoService;

@Component
public class ScheduleTask {
    @Autowired
    private OrderInfoService orderInfoService;
    @Scheduled(cron = "0,1 0,1 2,6 * * ?")
    public void task() {
// 获取当前系统时间
        DateTime dateTime = new DateTime();
//        获取当前系统时间加一天的时间
        DateTime dateTime1 = dateTime.plusDays(1);
//        调用发送消息的方法
        orderInfoService.sendMessage(dateTime1.toString("yyyy-MM-dd"));
    }
}
