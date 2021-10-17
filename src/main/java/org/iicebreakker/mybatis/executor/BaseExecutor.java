package org.iicebreakker.mybatis.executor;

import org.iicebreakker.mybatis.mapping.MappedStatement;

import java.sql.SQLException;
import java.util.List;

/**
 * executor基类
 * @author IIceBreakker
 */
public abstract class BaseExecutor implements Executor {

    /**
     * 交给不同的子类的实现，SimpleExecutor ReuseExecutor BatchExecutor
     *
     * @param ms
     * @return
     * @throws SQLException
     * @param parameter
     * @param <E>
     */
    protected abstract <E> List<E> doQuery(MappedStatement ms, Object parameter) throws SQLException;

    @Override
    public <E> List<E> query(MappedStatement ms, Object parameter) throws SQLException {
        return this.queryFromDatabase(ms, parameter);
    }

    private <E> List<E> queryFromDatabase(MappedStatement ms, Object parameter) throws SQLException {
        return this.doQuery(ms, parameter);
    }
}
