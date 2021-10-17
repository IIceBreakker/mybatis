package org.iicebreakker.mybatis.session.defaults;

import org.iicebreakker.mybatis.session.Configuration;
import org.iicebreakker.mybatis.session.SqlSession;
import org.iicebreakker.mybatis.session.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * 这里的构造函数简化处理了
     *
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(this.configuration);
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }
}
