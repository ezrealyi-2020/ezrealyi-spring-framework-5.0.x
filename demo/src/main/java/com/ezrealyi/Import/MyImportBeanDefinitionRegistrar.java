package com.ezrealyi.Import;

import com.ezrealyi.annotation.EnableWork;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.Optional;

/**
 * @Description:
 * @Author: ezrealyi
 * @Email: ezrealyi@aliyun.com
 * @Date: 2021-07-18 14:04
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println("MyImportBeanDefinitionRegistrar------" + importingClassMetadata.getClassName());

		final String[] studentServiceImplBeanDefinitionNames = {null};
		if (importingClassMetadata.hasAnnotation(EnableWork.class.getName())) {
			String[] beanDefinitionNames = registry.getBeanDefinitionNames();
			Arrays.stream(beanDefinitionNames).forEach(beanDefinitionName -> {
				if (beanDefinitionName.equals("studentServiceImpl")) {
					studentServiceImplBeanDefinitionNames[0] = beanDefinitionName;
				}
			});

			Optional.ofNullable(studentServiceImplBeanDefinitionNames[0]).ifPresent(beanDefinitionName -> {
				System.out.println("---存在studentServiceImpl");
				// GenericBeanDefinition beanDefinition = (GenericBeanDefinition) registry.getBeanDefinition(beanDefinitionName);
			});
		}
	}
}
