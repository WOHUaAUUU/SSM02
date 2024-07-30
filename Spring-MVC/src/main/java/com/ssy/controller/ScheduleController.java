package com.ssy.controller;

import com.ssy.pojo.Schedule;
import com.ssy.service.ScheduleService;
import com.ssy.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {


    @Autowired

    private ScheduleService scheduleService;
    @GetMapping("/listAll")
    public R listAll() {
        List<Schedule> allSchedules = scheduleService.getAllSchedules();
        return R.ok(allSchedules);
    }

    @PostMapping("/add")
    public R addSchedule(@RequestBody Schedule schedule) {
        scheduleService.saveSchedule(schedule);
        return R.ok(null);
    }

    @PostMapping("/modify")
    public R modifySchedule(@RequestBody Schedule schedule) {
        scheduleService.updateSchedule(schedule);
        return R.ok(null);
    }

    @DeleteMapping("/delete/{id}")
    public R deleteSchedule(@PathVariable("id") Integer id) {
        scheduleService.removeById(id);
        return R.ok(null);
    }
}