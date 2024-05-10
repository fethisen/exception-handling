package com.exception.handling.exceptionhandling.service;

import com.exception.handling.exceptionhandling.service.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExceptionService {

    private List<String> items = new ArrayList<>();

    public String getItem(int index){
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }else {
            throw new NotFoundException("Item not found");
        }
    }
}
