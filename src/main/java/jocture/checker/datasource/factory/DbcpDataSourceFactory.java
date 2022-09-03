package jocture.checker.datasource.factory;

import jocture.checker.datasource.properties.ConnectionProperties;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DbcpDataSourceFactory implements DataSourceFactory {

    @Override
    public boolean supports(Class<? extends DataSource> type) {
        return type == BasicDataSource.class;
    }

    public DataSource create(ConnectionProperties prop) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());
        return dataSource;
    }
}
