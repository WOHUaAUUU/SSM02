package com.ssy.service.impl;

import com.ssy.pojo.Schedule;
import com.ssy.service.ScheduleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private static Map<Integer, Schedule> schedules;
    private static int maxId=5;

    static {
        schedules = new HashMap<>();
        Schedule schedule=null;

        schedule = new Schedule(1, "JAVA", false);
        schedules.put(1, schedule);
        schedule = new Schedule(2, "C++", false);
        schedules.put(2, schedule);
        schedule = new Schedule(3, "C#", false);
        schedules.put(3, schedule);
        schedule = new Schedule(4, "Python", false);
        schedules.put(4, schedule);
        schedule = new Schedule(5, "PHP", false);
        schedules.put(5, schedule);
    }
    @Override
    public List<Schedule> getAllSchedules() {
        return new ArrayList<>(schedules.values());
    }

    @Override
    public void addSchedule(Schedule schedule) {

    }

    @Override
    public void updateSchedule(Schedule schedule) {
         schedules.put(schedule.getId(), schedule);
    }

    @Override
    public void removeById(Integer scheduleId) {
        schedules.remove(scheduleId);
    }

    @Override
    public void saveSchedule(Schedule schedule) {
        maxId++;
        schedule.setId(maxId);
        schedules.put(maxId, schedule);
    }
}
