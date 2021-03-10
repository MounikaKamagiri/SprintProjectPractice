package com.cg.apps.employeemswithoutjpa.dao;

import java.util.*;

import com.cg.apps.employeemswithoutjpa.entities.*;
import org.springframework.stereotype.Component;

@Component
public class StoreHolder {

    public StoreHolder() {
    }

    private Map<Integer, Employee> store = new HashMap<>();

    public Map<Integer, Employee> getStore() {
        return store;
    }


}
