package org.amazon.com.rhapsody.dao;

import java.util.List;

import org.amazon.com.rhapsody.dao.entity.OrderDetail;

public interface OrderDetailStoreDao {
	public OrderDetail findByCustomerId(String customerId);

	public List<OrderDetail> findAllByOrderId(List<String> orderIds);

	public Iterable<OrderDetail> findAll();

	public void deleteAllByOrderId(List<String> orderIds);

	public List<OrderDetail> saveAll(List<OrderDetail> orders);
}
