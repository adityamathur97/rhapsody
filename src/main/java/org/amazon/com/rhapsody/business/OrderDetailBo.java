package org.amazon.com.rhapsody.business;

import java.util.List;

import org.amazon.com.rhapsody.dao.entity.OrderDetail;

public interface OrderDetailBo {
	public List<OrderDetail> getOrderDetailByOrderIds(List<String> list);

	public List<OrderDetail> getAllOrders();

	public List<OrderDetail> addOrders(List<OrderDetail> orders);

	public List<OrderDetail> deleteOrders(List<String> orderIds);

	public List<OrderDetail> updateOrders(List<OrderDetail> orders);

	public OrderDetail findByCustomerId(String customerId);
}
