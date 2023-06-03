package org.amazon.com.rhapsody.dao.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
@Entity
@Table(name = "customer_detail")
public class CustomerDetail {

	@Id
	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "customer_name")
	private String customerName;

	@OneToMany(mappedBy = "orderId")
	private List<OrderDetail> orders;

	public CustomerDetail() {
		this.customerId = UUID.randomUUID().toString();
	}

	public CustomerDetail(String uuid) {
		this.customerId = uuid;
	}
}
