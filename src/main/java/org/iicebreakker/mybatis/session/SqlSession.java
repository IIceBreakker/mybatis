package org.iicebreakker.mybatis.session;

import java.io.Closeable;
import java.util.List;

/**
 * SqlSession执行Sql的入口
 * @author IIceBreakker
 */
public interface SqlSession extends Closeable {

    /**
     * @param id 要执行的SQL方法的全限定名，例如org.iicebreakker.mapper.UserMapper.select;
     * @param parameter 查询参数
     * @param <T> 结果对象类型
     * @return 查询结果
     */
    <T> T selectOne(String id, Object parameter);
    <T> List<T> selectList(String id, Object parameter);

    /**
     * 获取Mapper实现类，实际上是动态代理
     *
     * @param type 例如UserMapper.class
     * @param <T> 例如 UserMapper
     * @return 例如UserMapper
     */
    <T> T getMapper(Class<T> type);
}
