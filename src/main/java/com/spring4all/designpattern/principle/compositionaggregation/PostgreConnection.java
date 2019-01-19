package com.spring4all.designpattern.principle.compositionaggregation;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 21:23
 **/
public class PostgreConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "Postgre数据库";
    }
}
