package com.rays.pro4.controller;

import java.io.IOException; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.rays.pro4.Bean.BaseBean;
import com.rays.pro4.Bean.OrderBean;
import com.rays.pro4.Bean.OrderBean;
import com.rays.pro4.Exception.ApplicationException;
import com.rays.pro4.Exception.DuplicateRecordException;

import com.rays.pro4.Model.OrderModel;
import com.rays.pro4.Model.OrderModel;
import com.rays.pro4.Util.DataUtility;
import com.rays.pro4.Util.DataValidator;
import com.rays.pro4.Util.PropertyReader;
import com.rays.pro4.Util.ServletUtility;

//TODO: Auto-generated Javadoc
/**
 * The Class OrderCtl.
 * 
 * @author Prakhar Solanki
 * 
 */
@WebServlet(name = "OrderCtl", urlPatterns = { "/ctl/OrderCtl" })
public class OrderCtl extends BaseCtl {

	private static final long serialVersionUID = 1L;

	/** The log. */
	private static Logger log = Logger.getLogger(OrderCtl.class);


	/*
	 * (non-Javadoc)
	 * 
	 * @see in.co.rays.ors.controller.BaseCtl#validate(javax.servlet.http.
	 * HttpServletRequest)
	 */
	@Override
	protected boolean validate(HttpServletRequest request) {
		System.out.println("uctl Validate");
		log.debug("OrderCtl Method validate Started");

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("productName"))) {
			request.setAttribute("productName", PropertyReader.getValue("error.require", "ProductName"));
			pass = false;
		} else if (!DataValidator.isName(request.getParameter("productName"))) {
			request.setAttribute("productName", "ProductName contains alphabet only");
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("customer"))) {
			request.setAttribute("customer", PropertyReader.getValue("error.require", "Customer"));
			pass = false;
		} 
		
		if (DataValidator.isNull(request.getParameter("orderDate"))) {
			request.setAttribute("orderDate", PropertyReader.getValue("error.require", "OrderDate"));
			pass = false;
		} else if (!DataValidator.isDate(request.getParameter("orderDate"))) {
			request.setAttribute("orderDate", PropertyReader.getValue("error.date", "OrderDate"));
			pass = false;
		}
		
	

		if (DataValidator.isNull(request.getParameter("quantity"))) {
			request.setAttribute("quantity", PropertyReader.getValue("error.require", "Quantity"));
			pass = false;
		} else if (!DataValidator.isInteger(request.getParameter("quantity"))) {
			request.setAttribute("quantity", PropertyReader.getValue("error.integer", "Quantity"));
			pass = false;
		}


		log.debug("OrderCtl Method validate Ended");

		return pass;
	}
	
	@Override
	protected void preload(HttpServletRequest request) {
		
		
			Map<Integer, String> map = new HashMap();

			map.put(1, "Prakhar");
			map.put(2, "Riya ");
			map.put(3, "Dilip");
			map.put(4, "Amit");
			map.put(5, "Neeraj");
			map.put(6, "Ayush");
			
			request.setAttribute("Order", map);
		
		
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.co.rays.ors.controller.BaseCtl#populateBean(javax.servlet.http.
	 * HttpServletRequest)
	 */
	
	

	
	
	/**
	 *  This is Populate Bean
	 */
	protected BaseBean populateBean(HttpServletRequest request) {
		System.out.println(" uctl Base bean P bean");
		log.debug("OrderCtl Method populatebean Started");

		OrderBean bean = new OrderBean();

		bean.setId(DataUtility.getLong(request.getParameter("id"))); 
		
		bean.setProductName(DataUtility.getString(request.getParameter("productName")));

		bean.setCustomer(DataUtility.getInt(request.getParameter("customer"))); 
		
		bean.setOrderDate(DataUtility.getDate(request.getParameter("orderDate")));

		bean.setQuantity(DataUtility.getInt(request.getParameter("quantity")));

	

		log.debug("OrderCtl Method populatebean Ended");

		return bean;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("OrderCtl Method doGet Started");

		String op = DataUtility.getString(request.getParameter("operation"));
		// get model
		OrderModel model = new OrderModel();
		long id = DataUtility.getLong(request.getParameter("id"));
		System.out.println("Order Edit Id >= " + id);
		if (id != 0 && id > 0) {
			System.out.println("in id > 0  condition");
			OrderBean bean;
			try {
				bean = model.findByPK(id);
				System.out.println(bean);
				ServletUtility.setBean(bean, request);
			} catch (ApplicationException e) {
				log.error(e);
				ServletUtility.handleException(e, request, response);
				return;
			}
		}

		ServletUtility.forward(getView(), request, response);
		log.debug("OrderCtl Method doGet Ended");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("uctl Do Post");

		log.debug("OrderCtl Method doPost Started");

		String op = DataUtility.getString(request.getParameter("operation"));
		long id = DataUtility.getLong(request.getParameter("id"));


		OrderModel model = new OrderModel();
		if (OP_SAVE.equalsIgnoreCase(op) || OP_UPDATE.equalsIgnoreCase(op)) {
			OrderBean bean = (OrderBean) populateBean(request);
			System.out.println(" U ctl DoPost 11111111");

			try {
				if (id > 0) {

					// System.out.println("hi i am in dopost update");
					
					model.update(bean);
					ServletUtility.setBean(bean, request);
					System.out.println(" U ctl DoPost 222222");
					ServletUtility.setSuccessMessage("Order is successfully Updated", request);

				} else {
					System.out.println(" U ctl DoPost 33333");
					long pk = model.add(bean);
					
					bean = model.findByPK(pk);
					
					ServletUtility.setBean(bean, request);

					ServletUtility.setSuccessMessage("Order is successfully Added", request);
			
				}
				

			} catch (ApplicationException e) {
				log.error(e);
				ServletUtility.handleException(e, request, response);
				return;
			} catch (DuplicateRecordException e) {
				System.out.println(" U ctl D post 4444444");
				ServletUtility.setBean(bean, request);
				ServletUtility.setErrorMessage("Login id already exists", request);
			}
		} else if (OP_DELETE.equalsIgnoreCase(op)) {
			System.out.println(" U ctl D p 5555555");

			OrderBean bean = (OrderBean) populateBean(request);
			try {
				model.delete(bean);
				System.out.println(" u ctl D Post  6666666");
				ServletUtility.redirect(ORSView.ORDER_CTL, request, response);
				return;
			} catch (ApplicationException e) {
				log.error(e);
				ServletUtility.handleException(e, request, response);
				return;
			}

		} else if (OP_CANCEL.equalsIgnoreCase(op)) {
			System.out.println(" U  ctl Do post 77777");

			ServletUtility.redirect(ORSView.ORDER_LIST_CTL, request, response);
			return;
		}
		ServletUtility.forward(getView(), request, response);

		log.debug("OrderCtl Method doPostEnded");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.co.rays.ors.controller.BaseCtl#getView()
	 */
	@Override
	protected String getView() {
		return ORSView.ORDER_VIEW;
	}

}
