package ChallengeComponents.Challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ChallengeComponents.Challenge.Entity.Order;
import ChallengeComponents.Challenge.Service.OrderService;

@SpringBootApplication
public class ChallengeApplication implements CommandLineRunner{
	
	@Autowired
	OrderService orderService;
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(2282, 800.0, 10.0);

		System.out.println("Pedido codigo:" + order.getCode());
		System.out.println("Valor total: R$" + orderService.Total(order));
	}
	
	

}
