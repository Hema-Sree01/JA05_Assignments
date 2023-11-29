package com.hexa.SpringappService;
    import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.hexa.Springappbean.Product;
	import com.hexa.Springappdao.IProductDAO;

	@Service
	public class IProductserviceImp implements IProductservice {

		@Autowired
		IProductDAO dao;


		@Override
		public Product getProduct() {
			  // business logics and input validations
			 // we call dao methods
			return dao.getProduct();
		}

	}


