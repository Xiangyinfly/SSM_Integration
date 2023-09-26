package com.xiang.mapper;

import com.xiang.pojo.Schedule;

import java.util.List;

public interface ScheduleMapper {
    List<Schedule> queryList();

    int deleteById(int id);

    int insert(Schedule schedule);

    int update(Schedule schedule);
}
