/*
package cn.bobasyu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

*/
/**
 * Spring Security 配置
 *
 * @author Boba
 *//*

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private DataSource dataSource;

    @Autowired
    public void setDataSource(@Qualifier("dataSource") DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("" +
                        "select uname as username , password, true " +
                        "from tbuser where uname = ?"
                )
                .authoritiesByUsernameQuery("" +
                        "select uname as username, 'ROLE_USER' " +
                        "from tbuser where uname = ?"
                )
                .passwordEncoder(new BCryptPasswordEncoder());
    }
}
*/
