package com.xiang.controller;

import com.xiang.pojo.Schedule;
import com.xiang.service.ScheduleService;
import com.xiang.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("schedule")
@Slf4j
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/{pageSize}/{currentPage}")
    public R page(@PathVariable int pageSize,@PathVariable int currentPage) {
        R r = scheduleService.page(pageSize,currentPage);
        log.info("query result:{}",r);
        return r;
    }

    @DeleteMapping("/{id}")
    public R remove(@PathVariable int id) {
        R r = scheduleService.remove(id);
        return r;
    }

    @PostMapping
    public R save(@Validated @RequestBody Schedule schedule, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return R.fail("error");
        }
        return scheduleService.save(schedule);
    }

    @PutMapping
    public R update(@Validated @RequestBody Schedule schedule, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return R.fail("error");
        }
        return scheduleService.update(schedule);
    }


}
