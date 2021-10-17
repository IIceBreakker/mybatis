package org.iicebreakker.mybatis.executor;

import org.iicebreakker.mybatis.mapping.MappedStatement;
import org.iicebreakker.mybatis.session.Configuration;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * 默认使用的executor
 * @author IIceBreakker
 */
public class SimpleExecutor extends BaseExecutor {

    private final Configuration configuration;

    public SimpleExecutor(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    protected <E> List<E> doQuery(MappedStatement ms, Object parameter) throws SQLException {
        Statement stmt = null;
        return null;
    }
}
