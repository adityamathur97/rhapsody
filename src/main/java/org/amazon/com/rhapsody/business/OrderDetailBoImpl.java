package org.amazon.com.rhapsody.business;

import java.util.ArrayList;
import java.util.List;

import org.amazon.com.rhapsody.dao.entity.OrderDetail;
import org.amazon.com.rhapsody.dao.sqlDao.OrderDetailStoreSqlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailBoImpl implements OrderDetailBo {

	@Autowired
	@Qualifier("orderDetailSqlDao")
	private OrderDetailStoreSqlDao orderDetailStoreDao;

	@Override
	public List<OrderDetail> getOrderDetailByOrderIds(List<String> orderIds) {

		return orderDetailStoreDao.findAllById(orderIds);
	}

	@Override
	public List<OrderDetail> getAllOrders() {
		List<OrderDetail> allOrders = new ArrayList<>();

		orderDetailStoreDao.findAll().forEach(allOrders::add);

		return allOrders;
	}

	@Override
	public List<OrderDetail> addOrders(List<OrderDetail> orders) {
		return orderDetailStoreDao.saveAll(orders);

	}

	@Override
	public List<OrderDetail> updateOrders(List<OrderDetail> orders) {

		return orderDetailStoreDao.saveAll(orders);
	}

	@Override
	public List<OrderDetail> deleteOrders(List<String> orderIds) {
		List<OrderDetail> ordersDeleted = orderDetailStoreDao.findAllById(orderIds);

		orderDetailStoreDao.deleteAllById(orderIds);

		return ordersDeleted;
	}

	@Override
	public OrderDetail findByCustomerId(String customerId) {

		return orderDetailStoreDao.findByCustomerId(customerId);
	}

}
