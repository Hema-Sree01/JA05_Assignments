package com.hexa.Springappdao;
import org.springframework.stereotype.Repository;

import com.hexa.Springappbean.Product;

@Repository
public class ProductDAOImp implements IProductDAO {

	@Override
	public Product getProduct() {

		// any DB Connectivity logics like JDBC,Hibernate,JPA etc..

		return new Product(101, "Mobile", 45000); // it is record coming from DB in realtime
	}

}

