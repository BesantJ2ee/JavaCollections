package Java8_Features;

public class Transaction {
	
	private Integer id;
	
	private String transactionType;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Transaction() {
		super();
	}

	public Transaction(Integer id, String transactionType, Integer value) {
		super();
		this.id = id;
		this.transactionType = transactionType;
		this.value = value;
	}

	private Integer value;

	
	

	

	

}
