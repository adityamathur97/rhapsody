package org.amazon.com.rhapsody.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetOrderDetailByIdsInput {
	List<String> orderIds;
}
