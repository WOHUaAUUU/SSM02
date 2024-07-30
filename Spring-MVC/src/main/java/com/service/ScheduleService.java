package com.service;

import com.pojo.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAllSchedules();
    void addSchedule(Schedule schedule);
    void updateSchedule(Schedule schedule);
    void removeById(Integer scheduleId);
    void saveSchedule(Schedule schedule);
}
