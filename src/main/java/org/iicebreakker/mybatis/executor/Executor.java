package org.iicebreakker.mybatis.executor;

import org.iicebreakker.mybatis.mapping.MappedStatement;

import java.sql.SQLException;
import java.util.List;

/**
 * executor接口
 * @author IIceBreakker
 */
public interface Executor {

    /**
     * 查询接口
     *
     * @param ms
     * @return
     * @throws SQLException
     * @param parameter
     * @param <E>
     */
    <E> List<E> query(MappedStatement ms, Object parameter) throws SQLException;

}
