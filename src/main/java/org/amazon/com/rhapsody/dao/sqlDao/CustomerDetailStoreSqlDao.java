package org.amazon.com.rhapsody.dao.sqlDao;

import org.amazon.com.rhapsody.dao.entity.CustomerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerDetailSqlDao")
public interface CustomerDetailStoreSqlDao extends JpaRepository<CustomerDetail, String> {

}
