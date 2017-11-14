package com.pujan1.api;

import com.pujan1.api.Application;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class servletInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {Application.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/api/*"};
    }
}
