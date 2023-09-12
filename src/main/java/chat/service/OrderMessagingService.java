package chat.service;


import chat.domain.Order;

public interface OrderMessagingService {

  void sendOrder(Order order);
  
}
