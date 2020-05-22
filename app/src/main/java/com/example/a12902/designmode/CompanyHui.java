package com.example.a12902.designmode;

public class CompanyHui implements Company{
    private Employee[] array=new Employee[3];
    public CompanyHui(){
        array[0]=new Employee("小达",24);
        array[1]=new Employee("小爱",27);
        array[2]=new Employee("小花",22);
    }

    public Employee[] getEmployees() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(array);
    }
}
