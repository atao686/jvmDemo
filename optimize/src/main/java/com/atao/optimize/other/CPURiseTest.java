package com.atao.optimize.other;


/**
 * @author by ztsong
 * @Date 2022/10/19
 */
public class CPURiseTest {

	public static final int initData = 666;
	public static User user = new User();

	public int compute() {  //一个方法对应一块栈帧内存区域
		int a = 1;
		int b = 2;
		int c = (a + b) * 10;
		return c;
	}

	public static void main(String[] args) {
		CPURiseTest riseTest = new CPURiseTest();
		while (true){
			riseTest.compute();
		}
	}

}

class User {

	private int id;
	private String name;

	byte[] a = new byte[1024*100];

	public User(){}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
