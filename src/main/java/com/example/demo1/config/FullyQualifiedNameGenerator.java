//package com.example.demo1.config;
//
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.AnnotationBeanNameGenerator;
//import org.springframework.core.type.MethodMetadata;
//
//public class FullyQualifiedNameGenerator extends AnnotationBeanNameGenerator {
//
//    @Override
//    protected String buildDefaultBeanName(BeanDefinition definition) {
//        if (definition.getSource() instanceof MethodMetadata methodMetadata) {
//            String className = methodMetadata.getDeclaringClassName();
//            String methodName = methodMetadata.getMethodName();
//            return className + "." + methodName;
//        }
//        return definition.getBeanClassName();
//    }
//}
