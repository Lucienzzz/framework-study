package com.zzq;

public class AUTO_Emp {
    private AUTO_Dept dept;

    public AUTO_Dept getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "AUTO_Emp{" +
                "dept=" + dept +
                '}';
    }
}
