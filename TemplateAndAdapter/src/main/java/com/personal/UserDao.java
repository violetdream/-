package com.personal;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * 2019/5/7/0007
 * Create by 刘仙伟
 */
public class UserDao extends JdbcTemplate{

    public UserDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql="select * from EUSER";
        return super.executeQuery(sql, new RowMapper<EUser>() {
            public EUser mapRow(ResultSet resultSet, int rowNum) throws Exception {
                EUser user=new EUser();
                user.setUserSeq(resultSet.getString("USERSEQ"));
                user.setCifSeq(resultSet.getString("CIFSEQ"));
                user.setUserId(resultSet.getString("USERID"));
                System.out.println("rowNum = " + rowNum);
                return user;
            }
        },new Object[]{});
    }
}
