package com.xiang.service;

import com.xiang.pojo.Schedule;
import com.xiang.util.R;
import org.springframework.stereotype.Service;

public interface ScheduleService {
    R page(int pageSize,int currentPage);

    R remove(int id);

    R save(Schedule schedule);

    R update(Schedule schedule);
}
