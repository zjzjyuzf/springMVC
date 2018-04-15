package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



//容器会自动发现这个实现类，必须要添加注解
public class SpittrWebAppInitializer 
					extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	
	//指定配置类
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	//映射
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"}; 
	}

}
