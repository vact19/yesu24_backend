package com.bookstore.yesu24.global.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.servlet.http.HttpServletRequest;

@Configuration
@EnableJpaAuditing
public class JpaConfig {


    @Bean
    public AuditorAware<String> auditorProvider(){
        /**
         *  AuditorAware 는 Optional<T> 를 뱉는 getCurrentAuditor 를 유일한 추상메소드로 갖는 함수형 인터페이스이다.
         */
        return new AuditorAwareImpl();
    }
}
