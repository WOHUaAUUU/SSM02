package com.ssy.service;

import com.ssy.pojo.Schedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScheduleService {
    List<Schedule> getAllSchedules();
    void addSchedule(Schedule schedule);
    void updateSchedule(Schedule schedule);
    void removeById(Integer scheduleId);
    void saveSchedule(Schedule schedule);
}
