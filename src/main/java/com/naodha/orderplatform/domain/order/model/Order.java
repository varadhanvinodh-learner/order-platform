package com.naodha.orderplatform.domain.order.model;

import java.time.Instant;
import java.util.UUID;

public class Order {
	private final UUID orderId;
	private final UUID customerId;
	private final OrderStatus status;
	private final Instant createdAt;
	public Order(UUID orderId, UUID customerId, OrderStatus status, Instant createdAt) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.status = status;
        this.createdAt = createdAt;
    }
	public UUID getOrderId() {
		return orderId;
	}
	public UUID getCustomerId() {
		return customerId;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public Instant getCreatedAt() {
		return createdAt;
	}
	
}
