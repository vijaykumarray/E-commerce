package com.ecommerce.project.configration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ecommerce.project.userDetailService.CustomUserDetailService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity

public class SecurityConfigration extends WebSecurityConfigurerAdapter{

@Autowired
 private CustomUserDetailService customUserDetailService;	
	
    @Override
	protected void configure(HttpSecurity http) throws Exception {
	
//		http	
//		.csrf()
//		.disable()
//		.authorizeRequests()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.httpBasic();
//	
		
		
    	http.csrf().disable()
        .authorizeHttpRequests()
        .antMatchers()
        .permitAll()
        .antMatchers()
        .authenticated()
        .anyRequest()
        .hasAnyAuthority("ADMIN")    //  -- here
        .and()
        .formLogin()
        .and()
        .httpBasic()
        .and()
        .logout()
        .permitAll();
	}
    @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
		auth.userDetailsService(this.customUserDetailService).passwordEncoder(passwordEncoder());
        
		//This is first Time		
    	//auth.inMemoryAuthentication().withUser("abc").password(this.passwordEncoder().encode("123")).roles("ADMIN");
    }
    
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
