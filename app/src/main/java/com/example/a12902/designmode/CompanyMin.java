package com.example.a12902.designmode;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company {
    private List<Employee> list=new ArrayList<>();
    public CompanyMin(){
        list.add(new Employee("小明",19));
        list.add(new Employee("小兰",22));
        list.add(new Employee("小方",23));
        list.add(new Employee("小施",17));
    }

    public List<Employee> getEmployees() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
