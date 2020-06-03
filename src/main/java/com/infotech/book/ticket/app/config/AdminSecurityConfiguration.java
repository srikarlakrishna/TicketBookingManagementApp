//package com.infotech.book.ticket.app.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.www.DigestAuthenticationEntryPoint;
//import org.springframework.security.web.authentication.www.DigestAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//@Order(1)
//public class AdminSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	private DigestAuthenticationEntryPoint getDigestEntryPoint() {
//		DigestAuthenticationEntryPoint digestEntryPoint = new DigestAuthenticationEntryPoint();
//		digestEntryPoint.setRealmName("admin-digest-realm");
//		digestEntryPoint.setKey("somedigestkey");
//		return digestEntryPoint;
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
//
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("admin")).roles("USER").and()
//				.withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
//	}
//
//	@Bean
//	public UserDetailsService userDetailsServiceBean() throws Exception {
//		return super.userDetailsServiceBean();
//	}
//
//	private DigestAuthenticationFilter getDigestAuthFilter() throws Exception {
//		DigestAuthenticationFilter digestFilter = new DigestAuthenticationFilter();
//
//		digestFilter.setUserDetailsService(userDetailsServiceBean());
//
//		digestFilter.setAuthenticationEntryPoint(getDigestEntryPoint());
//		return digestFilter;
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.headers().disable().antMatcher("/api/admin/**").addFilter(getDigestAuthFilter()).exceptionHandling()
//				.authenticationEntryPoint(getDigestEntryPoint()).and().authorizeRequests().antMatchers("/api/admin/**")
//				.hasRole("ADMIN");
//	}
//
//}
