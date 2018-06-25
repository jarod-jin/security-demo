package cn.jarod.securitydemo.config;


import cn.jarod.securitydemo.filter.XssFilter;
import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class XssConfig {

  /**
   * xss过滤拦截器
   */
  @Bean
  public FilterRegistrationBean xssFilterRegistrationBean() {
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setFilter(new XssFilter());
    filterRegistrationBean.setOrder(1);
    filterRegistrationBean.setEnabled(true);
    filterRegistrationBean.addUrlPatterns("/*");
    Map<String, String> initParameters = new HashMap();
    initParameters.put("excludes", "/favicon.ico,/img/*,/js/*,/css/*");
    initParameters.put("isIncludeRichText", "true");
    filterRegistrationBean.setInitParameters(initParameters);
    return filterRegistrationBean;
  }

}
