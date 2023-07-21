package ChallengeComponents.Challenge.Entity;

public class Order {
	
	Integer code;
	Double basic;
	Double discount;
	
	
	
	public Order(Integer code, Double basic, Double discount) {
		super();
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}

	
	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public Double getBasic() {
		return basic;
	}


	public void setBasic(Double basic) {
		this.basic = basic;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	

}
