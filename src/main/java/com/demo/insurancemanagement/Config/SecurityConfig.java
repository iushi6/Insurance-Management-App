package com.demo.insurancemanagement.Config;
//package com.demo.insurancemanagement.Security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private JwtTokenProvider jwtTokenProvider;
//
//    @Autowired
//    private CustomUserDetailsService userDetailsService;
//
//    @Value("${jwt.secret}")
//    private String jwtSecret;
//
//    @Value("${jwt.expirationInMs}")
//    private int jwtExpirationInMs;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .csrf().disable()
//            .authorizeRequests()
//                .antMatchers(HttpMethod.POST, "/api/auth/login").permitAll()
//                .antMatchers(HttpMethod.POST, "/api/clients").hasRole("ADMIN")
//                .antMatchers(HttpMethod.PUT, "/api/clients/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.DELETE, "/api/clients/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//            .and()
//            .apply(new JwtConfigurer(jwtTokenProvider))
//            .and()
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public JwtTokenProvider jwtTokenProvider() {
//        return new JwtTokenProvider(jwtSecret, jwtExpirationInMs);
//    }
//}
//
