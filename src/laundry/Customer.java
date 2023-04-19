package laundry;

public class Customer {
	private static int count ;
	private int custid ;
	private String custname;
	private String custmobile;
	private String custemail;
	private String custaddress;
	
	static
	{
		count=1000;
	}
	
	public Customer( String custname, String custmobile, String custemail, String custaddress) {
		count++;
		this.custid=count;
		this.custname = custname;
		this.custmobile = custmobile;
		this.custemail = custemail;
		this.custaddress = custaddress;
		
	}
           

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustmobile() {
		return custmobile;
	}

	public void setCustmobile(String custmobile) {
		this.custmobile = custmobile;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

	public String getCustaddress() {
		return custaddress;
	}

	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}


	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custmobile=" + custmobile + ", custemail="
				+ custemail + ", custaddress=" + custaddress + "]";
	}
	
	
}
