package org.amazon.com.rhapsody.api;

import java.util.List;

import org.amazon.com.rhapsody.business.OrderDetailBo;
import org.amazon.com.rhapsody.dao.entity.OrderDetail;
import org.amazon.com.rhapsody.model.AddOrdersInput;
import org.amazon.com.rhapsody.model.AddOrdersOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddOrders {

	@Autowired
	private OrderDetailBo orderDetailBoImpl;

	@RequestMapping(method = RequestMethod.POST, value = "/orders")
	public AddOrdersOutput addOrderDetails(@RequestBody AddOrdersInput input) {
		List<OrderDetail> ordersAdded = orderDetailBoImpl.addOrders(input.getOrders());

		return AddOrdersOutput.builder()
				.isSuccessful(true)
				.ordersAdded(ordersAdded)
				.build();
	}
}
