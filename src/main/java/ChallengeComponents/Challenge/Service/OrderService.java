package ChallengeComponents.Challenge.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ChallengeComponents.Challenge.Entity.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	
	
	public Double Total(Order order) {
		
		Double desconto = (order.getBasic() * order.getDiscount()) / 100;
		
		Double totalWithDiscount = order.getBasic() - desconto;
		
		Double Total = shippingService.shipmentFreight(totalWithDiscount);
		
		return Total;
	}
	
	

}
