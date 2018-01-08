package com.zero;

import com.alibaba.fastjson.JSONObject;
import com.zero.profiles.ConfigBean;
import com.zero.profiles.ConfigTestBean;
import com.zero.tools.InitPublicPropertyConfigure;
import com.zero.util.MyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class, ConfigTestBean.class})
//启注解事务管理
@EnableTransactionManagement  // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@MapperScan(basePackages = "com.zero.dao", markerInterface = MyMapper.class)
public class SpringBootDemoApplication {

//	@Override  //	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringBootDemoApplication.class);
//	}

    public static void main(String[] args) {
        try {
            Map<String, String> map = new HashMap<String, String>();

            InputStream in = SpringBootDemoApplication.class.getClassLoader().getResourceAsStream("zero.properties");
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            try {
                while ((line = reader.readLine()) != null) {
                    try {
                        String[] ms = line.split("=");
                        map.put(ms[0], ms[1]);
                    } catch (Exception e) {

                    }
                }
            } catch (IOException e) {
                System.err.println("error" + e.getMessage());
            } finally {
                try {
                    reader.close();
                    in.close();
                } catch (IOException e) {
                    System.err.println("error" + e.getMessage());
                }
            }

            String url = map.get("project.basic.config.url").toString();
            String passKey = map.get("passKey").toString();

            System.out.println("url:" + url + "   passKey:" + passKey);
            Properties p = InitPublicPropertyConfigure.getHttpProperties(url, passKey);

            SpringApplication app = new SpringApplication(SpringBootDemoApplication.class);
            app.setDefaultProperties(p);
            app.run(args);
        } catch (Exception e) {
            System.out.println("error *** " + e.getMessage());
        }
    }

//	@Autowired
//	private Environment env;

    // destroy-method="close"的作用是当数据库连接不使用的时候,就把该连接重新放到数据池中,方便下次使用调用.
    /*@Bean(destroyMethod =  "close")
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名
		dataSource.setPassword(env.getProperty("spring.datasource.password"));//密码
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setInitialSize(2);//初始化时建立物理连接的个数
		dataSource.setMaxActive(20);//最大连接池数量
		dataSource.setMinIdle(0);//最小连接池数量
		dataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒。
		dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql
		dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效
		dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。
		dataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache
		return dataSource;
	}*/
}
