package ChallengeComponents.Challenge.Service;
import org.springframework.stereotype.Service;


@Service
public class ShippingService {

	public Double shipmentFreight(Double totalWithDiscount) {
		
		
		
			if (totalWithDiscount < 100) {
				totalWithDiscount += 20;
			} else if (totalWithDiscount >= 100 && totalWithDiscount <= 200) {
				totalWithDiscount += 12;
			}
		return totalWithDiscount;
		}
	}
	
	
