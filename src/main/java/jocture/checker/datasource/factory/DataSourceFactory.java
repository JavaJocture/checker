package jocture.checker.datasource.factory;

import jocture.checker.datasource.properties.ConnectionProperties;

import javax.sql.DataSource;

//OCP(Open-Closed Principal) : 확장에는 열려있고, 수정에는 닫혀있다!
public interface DataSourceFactory {

    boolean supports(Class<? extends DataSource> type);

    DataSource create(ConnectionProperties prop);

    static DataSourceFactory getDefaultFactory() {
        return DefaultDataSourceFactory.getInstance();
    }
}
