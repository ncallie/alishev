package ru.ncallie.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer { //заменяет web.xml
    @Override
    protected Class<?>[] getRootConfigClasses() { //не используем
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class}; //где находится SpringConfig
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //все запросы на servlet
    }
}
