package org.amazon.com.rhapsody.dao.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
@Entity
@Table(name = "order_detail")
public class OrderDetail {
	@Id
	@Column(name = "order_id")
	private String orderId;

	@ManyToOne(targetEntity = CustomerDetail.class)
	private String customerId;

	@Column(name = "total")
	private Integer total;

	public OrderDetail() {
		this.orderId = UUID.randomUUID().toString();
	}

}
