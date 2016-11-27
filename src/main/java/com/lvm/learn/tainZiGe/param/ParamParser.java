package com.lvm.learn.tainZiGe.param;

import com.lvm.learn.tainZiGe.util.MStrings;

public class ParamParser {
	/**
	 * 参数源
	 */
	private String source;
	/**
	 * 参数前缀
	 */
	private String prefix;
	/**
	 * 解析后的值
	 */
	private String value;
	/**
	 * 是否成功
	 */
	private Boolean success=false;

	public ParamParser(String source, String prefix) {
		this.source = source;
		this.prefix = prefix;

	}

	public static ParamParser parse(String source, String prefix) {
		ParamParser paramParser = new ParamParser(source, prefix);
		paramParser.parse();
		return paramParser;
	}

	public void parse() {
		if(MStrings.valueOf(this.source).isNullOrEmpty())
			return;
		if(MStrings.valueOf(this.prefix).isNullOrEmpty())
			return;
		if(!this.source.startsWith(prefix))
			return;		 
		this.value = this.source.replace(prefix, "");
		this.success = true;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	

}
