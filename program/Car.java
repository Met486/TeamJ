class Car 
{
	private int mileage; // 走行距離
	private int fuel; // ガソリン量

	// コンストラクタ
	public Car() 
	{
		mileage = 0;
		fuel = 10;
		System.out.println("Constructor: " + mileage + ", " + fuel);
	}

	// 前進
	public void goForward() 
	{
		if (mileage + 2 <= 20 && fuel - 1 >= 0) {
			mileage += 2;
			fuel -= 1;
			System.out.println("goForward: " + mileage + ", " + fuel);
		}
	}

	// 旋回
	public void turn() 
	{
		if (mileage + 1 <= 20 && fuel - 2 >= 0) {
			mileage += 1;
			fuel -= 2;
			System.out.println("turn: " + mileage + ", " + fuel);
		}
	}

	// 給油
	public void refuel() 
	{
		fuel = 10;
		System.out.println("refuel: " + mileage + ", " + fuel);
	}

	public int getmileage() 
	{
		return mileage;
	}

	public int getfuel() 
	{
		return fuel;
	}
}
