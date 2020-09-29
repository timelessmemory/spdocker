package com.timeless.spdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Map<String, Object>> select() {
        return demoMapper.select();
    }
}
