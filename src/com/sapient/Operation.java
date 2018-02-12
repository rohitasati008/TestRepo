package com.sapient;

public class Operation implements MarketData{

	int  k = 9 ;
	public static  int add(int a , int b )
	{
	return (a+b);
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public static void main(String[] args) {
		MarketData m = new  Operation() ;
		
		System.out.println(m.getK());
	}
}
