package jocture.checker.datasource.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
@Setter @Getter
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceProperties {

    private Class<? extends DataSource> type;
    private List<ConnectionProperties> list;
}
