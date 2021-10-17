package org.iicebreakker.mybatis.mapping;

import org.iicebreakker.mybatis.session.Configuration;

/**
 * Mybatis使用MappedStatement保存每条SQL语句的信息
 * @author IIceBreakker
 */
public class MappedStatement {
    private String resource;
    private Configuration configuration;
    private String id;
    private String namespace;
    private String resultType;
    private String sql;
}
