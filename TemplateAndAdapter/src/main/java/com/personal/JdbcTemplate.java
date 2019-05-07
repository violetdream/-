package com.personal;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 2019/5/7/0007
 * Create by 刘仙伟
 */
public abstract class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values){

        try {
            Connection connection=this.getConnection();
            PreparedStatement preparedStatement=this.createPreparedStatement(connection,sql);
            ResultSet rs=this.executeQuery(preparedStatement,values);
            List<?> result=this.handleResultSet(rs,rowMapper);

            this.closeResultSet(rs);
            this.closeStatement(preparedStatement);
            this.closeConnection(connection);
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  null;
    }

    private void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
    private void closeStatement(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }
    private void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }
    private List<?> handleResultSet(ResultSet rs,RowMapper<?> rowMapper) throws Exception {
        List<Object> result=new ArrayList<Object>();
        int rowNum=1;
        while(rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement pstm,Object[] values) throws SQLException {
        for(int i=0;i<values.length;i++){
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }
    private PreparedStatement createPreparedStatement(Connection conn,String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }
    private Connection getConnection() throws SQLException {
        return  this.dataSource.getConnection();
    }
}
