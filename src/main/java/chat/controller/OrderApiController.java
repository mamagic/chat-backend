package chat.controller;

import chat.domain.Order;
import chat.service.OrderMessagingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping(path="/",
                //produces="application/json"
                produces="text/plain;charset=UTF-8"
)
@CrossOrigin(origins="http://localhost:4200")
public class OrderApiController {

  private OrderMessagingService orderMessages;

  public OrderApiController(OrderMessagingService orderMessages) {
    this.orderMessages = orderMessages;
  }

  @PostMapping(consumes = "text/plain;charset=UTF-8", produces = "text/plain;charset=UTF-8")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<String> postOrder(@RequestBody String message) {
	  log.info("Before SENDED MESSAGE:  " + message);
	  //orderMessages.sendOrder(order);
	  log.info("SENDED MESSAGE:  " + message);
      return ResponseEntity.ok("send ok");
  }

}
