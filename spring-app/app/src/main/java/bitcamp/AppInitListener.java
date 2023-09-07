package bitcamp;

import bitcamp.AppConfig;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInitListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ServletContextListener.super.contextInitialized(sce);

    WebApplicationContext iocContainer = new AnnotationConfigWebApplicationContext();
    iocContainer.register(AppConfig.class);

    DispatcherServlet servlet = new DispatcherServlet(iocContainer);
    ServletRegistration.Dynamic registration =  sc.addServlet("app", servlet);
    registration.setLoadOnStartup(1);
    registration.addMapping("/app/*");
    registration.setMultipartConfig(new MultipartConfigElement(null, 10000000, 150000000, 1000000));
  }
}