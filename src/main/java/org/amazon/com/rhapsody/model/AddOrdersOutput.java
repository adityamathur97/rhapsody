package org.amazon.com.rhapsody.model;

import java.util.List;

import org.amazon.com.rhapsody.dao.entity.OrderDetail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddOrdersOutput {
	boolean isSuccessful;
	List<OrderDetail> ordersAdded;
}
