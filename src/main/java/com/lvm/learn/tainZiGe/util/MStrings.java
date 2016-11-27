package com.lvm.learn.tainZiGe.util;

public class MStrings {
	/**
	 * 正在处理的字符串值
	 */
	private String value;
	
	/**
	 * 构造函数
	 * 将传入的字符串 存入 <code>value</code>
	 * @param value
	 */
	public MStrings(String value){
		this.value = value;
	}
	
	public static MStrings valueOf(String value) {
		MStrings ret = new MStrings(value);
		return ret;
	}
	
	/**
	 * 判断是否null or empty
	 * empty 是指值为“”
	 * @return
	 */
	public Boolean isNullOrEmpty(){
		return (this.value==null)||this.value.equals("");
	}
}
