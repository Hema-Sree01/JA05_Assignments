package com.hexa.Springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexa.Springappbean.Product;
import com.hexa.SpringappService.IProductservice;
import com.hexa.SpringappService.IProductserviceImp;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.hexaware.springapp"})
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Presentation Layer UI" );

        		ApplicationContext container = new AnnotationConfigApplicationContext(App.class);

        		IProductservice  service =	container.getBean(IProductserviceImp.class);

        			Product product =	service.getProduct();

        				System.out.println(product);



    }
}