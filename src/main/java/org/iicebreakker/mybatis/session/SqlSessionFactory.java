package org.iicebreakker.mybatis.session;

/**
 * SqlSession工厂
 */
public interface SqlSessionFactory {

    /**
     * 创建一个SqlSession
     *
     * @return SqlSession实例
     */
    SqlSession openSession();

}
