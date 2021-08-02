package com.sai.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SaiSpringMvcIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configfigFiles= {clientsConfig.class};
		return configfigFiles;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mappings= {"/"};
		return mappings;
	}

}
