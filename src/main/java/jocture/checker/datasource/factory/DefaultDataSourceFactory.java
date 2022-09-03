package jocture.checker.datasource.factory;

import jocture.checker.datasource.properties.ConnectionProperties;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DefaultDataSourceFactory implements DataSourceFactory {

    private static final DataSourceFactory INSTANCE = new DefaultDataSourceFactory();

    @Override
    public boolean supports(Class<? extends DataSource> type) {
        return true;
    }

    public DataSource create(ConnectionProperties prop) {
        return new DriverManagerDataSource(prop.getUrl(), prop.getUsername(), prop.getPassword());
    }

    static DataSourceFactory getInstance() {
        return INSTANCE;
    }
}
