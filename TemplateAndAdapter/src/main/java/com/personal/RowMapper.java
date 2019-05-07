package com.personal;

import java.sql.ResultSet;

/**
 * 2019/5/7/0007
 * Create by 刘仙伟
 */
public interface RowMapper<T> {
    T mapRow(ResultSet resultSet,int rowNum) throws Exception;
}
