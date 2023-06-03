package org.amazon.com.rhapsody.api;

import java.util.List;

import org.amazon.com.rhapsody.business.OrderDetailBo;
import org.amazon.com.rhapsody.dao.entity.OrderDetail;
import org.amazon.com.rhapsody.model.UpdateOrdersInput;
import org.amazon.com.rhapsody.model.UpdateOrdersOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateOrders {

	@Autowired
	private OrderDetailBo orderDetailBoImpl;

	@RequestMapping(method = RequestMethod.PUT, value = "/orders/updateOrderIds")
	public UpdateOrdersOutput updateOrders(@RequestBody UpdateOrdersInput input) {

		List<OrderDetail> updatedOrders = orderDetailBoImpl.updateOrders(input.getOrders());

		return UpdateOrdersOutput.builder()
				.updatedOrders(updatedOrders)
				.build();
	}

}
