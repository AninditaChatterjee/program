class IncomeTaxDemo
{
	public static void main(String a[])
	{
		double income = 5978.21;
		double tax = 0.35;

		double incometax = tax * income;

		int rupees = (int) incometax;
		double paisa = incometax - rupees;

		System.out.println("income = " + income);
		System.out.println("tax = " + tax);
		System.out.println("incometax = " + incometax);
		System.out.println("rupees = " + rupees);
		System.out.println("paisa = " + paisa);
	}
}