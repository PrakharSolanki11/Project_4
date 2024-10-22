package com.rays.proj4.Test;


import com.rays.pro4.Bean.CustomerBean;
import com.rays.pro4.Bean.MarksheetBean;
import com.rays.pro4.Exception.ApplicationException;
import com.rays.pro4.Model.CustomerModel;
import com.rays.pro4.Model.UserModel;

public class CustomerTest {
	
	public static void main(String[] args) throws ApplicationException {
	
		//testInsert();
		testDelete();
	}
	
	public static void testInsert() {
		try {
			CustomerBean bean = new CustomerBean();

			bean.setId(1);
			bean.setClientName("Prakhar Solanki");
			bean.setLocation("Indore");
			bean.setContactNumber(9977585934L);
			bean.setImportance("High");
			

			CustomerModel model = new CustomerModel();

			long pk = model.add(bean);

			System.out.println("record insert"+pk);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//	public static void testDelete() throws ApplicationException{
//		
//		CustomerModel model = new CustomerModel();
//		
//		CustomerBean bean = new CustomerBean();
//		long pk=1;
//		bean.setId(pk);
//	    
//	    	model.delete(bean);
//	   }
	
	public static void testDelete() {
		try {
			CustomerBean bean = new CustomerBean();
			CustomerModel model = new CustomerModel();
			Long pk = 2L;
			bean.setId(pk);
			model.delete(bean);

			
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}
	   

	}


