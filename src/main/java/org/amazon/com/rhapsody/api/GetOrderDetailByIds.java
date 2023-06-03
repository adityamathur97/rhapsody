package org.amazon.com.rhapsody.api;

import java.util.List;

import org.amazon.com.rhapsody.business.OrderDetailBo;
import org.amazon.com.rhapsody.dao.entity.OrderDetail;
import org.amazon.com.rhapsody.model.GetOrderDetailByIdsInput;
import org.amazon.com.rhapsody.model.GetOrderDetailByIdsOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class GetOrderDetailByIds {

	@Autowired
	private OrderDetailBo orderDetailBoImpl;

	@RequestMapping(method = RequestMethod.GET, value = "/orders/getOrderIds")
	public GetOrderDetailByIdsOutput getOrderDetailById(@RequestBody GetOrderDetailByIdsInput input) {

		log.info("Calling GetAllOrderDetailByIds api with input - {}", input);
		List<OrderDetail> orders = orderDetailBoImpl.getOrderDetailByOrderIds(input.getOrderIds());

		return GetOrderDetailByIdsOutput.builder()
				.orders(orders)
				.build();
	}

}
