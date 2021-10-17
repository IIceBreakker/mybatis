package org.iicebreakker.mybatis.session;

import lombok.Data;
import org.iicebreakker.mybatis.mapping.MappedStatement;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局配置
 */
@Data
public class Configuration {
    private String jdbcDriver;
    private String jdbcUrl;
    private String jdbcUsername;
    private String jdbcPassword;
    private Map<String, MappedStatement> mappedStatements = new HashMap<>();

    public  MappedStatement getMappedStatement(String id) {
            return this.mappedStatements.get(id);
    }
}
