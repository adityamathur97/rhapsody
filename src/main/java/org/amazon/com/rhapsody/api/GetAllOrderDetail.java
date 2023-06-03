package org.amazon.com.rhapsody.api;

import java.util.List;

import org.amazon.com.rhapsody.business.OrderDetailBo;
import org.amazon.com.rhapsody.dao.entity.OrderDetail;
import org.amazon.com.rhapsody.model.GetAllOrderDetailInput;
import org.amazon.com.rhapsody.model.GetAllOrderDetailOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class GetAllOrderDetail {

	@Autowired
	private OrderDetailBo orderDetailBoImpl;

	@RequestMapping("/orders")
	public GetAllOrderDetailOutput getAllOrders(GetAllOrderDetailInput input) {

		log.info("Calling GetAllOrderDetailInput api with input - {}", input.toString());
		List<OrderDetail> allOrders = orderDetailBoImpl.getAllOrders();

		return GetAllOrderDetailOutput.builder()
				.allOrders(allOrders)
				.build();
	}
}
