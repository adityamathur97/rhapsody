package org.amazon.com.rhapsody.api;

import java.util.List;

import org.amazon.com.rhapsody.business.OrderDetailBo;
import org.amazon.com.rhapsody.dao.entity.OrderDetail;
import org.amazon.com.rhapsody.model.DeleteOrdersInput;
import org.amazon.com.rhapsody.model.DeleteOrdersOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteOrders {

	@Autowired
	private OrderDetailBo orderDetailBoImpl;

	@RequestMapping(method = RequestMethod.DELETE, value = "/orders/deleteOrderIds")
	public DeleteOrdersOutput deleteOrders(@RequestBody DeleteOrdersInput input) {

		List<OrderDetail> ordersDeleted = orderDetailBoImpl.deleteOrders(input.getOrderIds());

		return DeleteOrdersOutput.builder()
				.ordersDeleted(ordersDeleted)
				.build();
	}
}
