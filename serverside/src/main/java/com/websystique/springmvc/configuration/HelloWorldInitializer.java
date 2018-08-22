package com.websystique.springmvc.configuration;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.util.Set;

public class HelloWorldInitializer
//        extends AbstractAnnotationConfigDispatcherServletInitializer
        extends AbstractSecurityWebApplicationInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext>
{
    public HelloWorldInitializer() {
        System.out.println("创建了一个HelloWorldInitializer");
    }

//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[] { HelloWorldConfiguration.class };
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return null;
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[] { "/" };
//    }
//
//    @Override
//    protected Filter[] getServletFilters() {
//    	Filter [] singleton = { new CORSFilter()};
//    	return singleton;
//    }
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        System.out.println("执行onStartup.............");
//        super.onStartup(servletContext);
//        // Create the root appcontext
//        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//        rootContext.register(RootConfig.class);
//        // since we registered RootConfig instead of passing it to the constructor
//        rootContext.refresh();
//
//        // Manage the lifecycle of the root appcontext
//        servletContext.addListener(new ContextLoaderListener(rootContext));
//        servletContext.setInitParameter("defaultHtmlEscape", "true");
//
//        // now the config for the Dispatcher servlet
//        AnnotationConfigWebApplicationContext mvcContext = new AnnotationConfigWebApplicationContext();
//        mvcContext.register(WebMvcConfig.class);
//
//        // The main Spring MVC servlet.
//        ServletRegistration.Dynamic appServlet = servletContext.addServlet(
//                "appServlet", new DispatcherServlet(mvcContext));
//        appServlet.setLoadOnStartup(1);
//        Set<String> mappingConflicts = appServlet.addMapping("/");
//
//        if (!mappingConflicts.isEmpty()) {
//            for (String s : mappingConflicts) {
//                System.out.println("Mapping conflict: " + s);
//            }
//            throw new IllegalStateException(
//                    "'appServlet' cannot be mapped to '/' under Tomcat versions <= 7.0.14");
//        }
//    }

    @Override
    public void initialize(ConfigurableApplicationContext ac) {
        ConfigurableEnvironment appEnvironment = ac.getEnvironment();
        appEnvironment.addActiveProfile("demo");
    }
}