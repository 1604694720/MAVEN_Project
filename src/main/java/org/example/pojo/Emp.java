package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private Date hiredate;
    private double sal;
}
