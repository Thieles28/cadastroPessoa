package app.com.cadastro.security;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SegurancaConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable().antMatcher("/**").authorizeRequests()
//                .antMatchers("/", "/index.html").authenticated()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login().permitAll()
//                .and().
//                logout().logoutSuccessUrl("/");
//    }
//}
