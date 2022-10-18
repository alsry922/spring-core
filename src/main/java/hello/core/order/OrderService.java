package hello.core.order;

import hello.core.member.Member;

public interface OrderService {
  Order createOrder(Long id, String itemName, int price);
}
