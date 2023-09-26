package com.xiang.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiang.mapper.ScheduleMapper;
import com.xiang.pojo.Schedule;
import com.xiang.service.ScheduleService;
import com.xiang.util.PageBean;
import com.xiang.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public R page(int pageSize, int currentPage) {
        PageHelper.startPage(currentPage,pageSize);
        List<Schedule> scheduleList = scheduleMapper.queryList();
        PageInfo<Schedule> info = new PageInfo<>(scheduleList);
        PageBean<Schedule> schedulePageBean = new PageBean<>(currentPage, pageSize, info.getTotal(), info.getList());
        return R.ok(schedulePageBean);
    }

    @Override
    public R remove(int id) {
        int rows = scheduleMapper.deleteById(id);
        if (rows > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R save(Schedule schedule) {
        int rows = scheduleMapper.insert(schedule);
        if (rows > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R update(Schedule schedule) {
        if (schedule.getId() == null) {
            return R.fail("id error");
        }

        int rows = scheduleMapper.update(schedule);
        if (rows > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }
}
