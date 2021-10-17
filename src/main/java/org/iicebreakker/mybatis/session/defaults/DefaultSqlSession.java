package org.iicebreakker.mybatis.session.defaults;

import org.iicebreakker.mybatis.executor.Executor;
import org.iicebreakker.mybatis.executor.SimpleExecutor;
import org.iicebreakker.mybatis.mapping.MappedStatement;
import org.iicebreakker.mybatis.session.Configuration;
import org.iicebreakker.mybatis.session.SqlSession;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author IIceBreakker
 */
public class DefaultSqlSession implements SqlSession {

    private final Configuration configuration;

    private Executor executor;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
        this.executor = new SimpleExecutor(configuration);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        return null;
    }

    @Override
    public <T> List<T> selectList(String id, Object parameter) {
        List<T> result;
        MappedStatement mappedStatement = this.configuration.getMappedStatement(id);
        try {
            result = this.executor.query(mappedStatement, parameter);
        } catch (SQLException e) {
            throw new RuntimeException("Error querying database.  Cause: " + e, e);
        }
        return result;
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return null;
    }

    @Override
    public void close() throws IOException {

    }
}
