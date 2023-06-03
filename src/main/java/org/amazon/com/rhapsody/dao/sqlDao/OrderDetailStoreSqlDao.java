package org.amazon.com.rhapsody.dao.sqlDao;

import org.amazon.com.rhapsody.dao.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("orderDetailSqlDao")
public interface OrderDetailStoreSqlDao extends JpaRepository<OrderDetail, String> {

	public OrderDetail findByCustomerId(String customerId);
}
