package Task3;

public class Product implements Taxable {
	
	private int pid;
	private double price;
	private int quantity;

	public Product(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public void calcTax() {
		// TODO Auto-generated method stub
		double totalAmountWithoutTax=this.price*this.quantity;
		double salesTaxofTheProduct=totalAmountWithoutTax*salesTax/100;
		System.out.println("Total amount without tax: "+totalAmountWithoutTax);
		System.out.println("Sales Tax for the Product: "+salesTaxofTheProduct);
		double totalAmountWithTax=totalAmountWithoutTax+salesTaxofTheProduct;
		System.out.println("Total amount with tax: "+totalAmountWithTax);
	}

}
