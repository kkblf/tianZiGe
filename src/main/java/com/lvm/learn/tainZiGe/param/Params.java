package com.lvm.learn.tainZiGe.param;

import java.util.ArrayList;
import java.util.List;

import com.lvm.learn.tainZiGe.util.MStrings;

public class Params {

	public final static String PARAM_SOURCE_FILE_PATH_PREFIX = "-source:";
	public final static String PARAM_DESTINATION_FILE_PATH_PREFIX = "-des:";
	/**
	 * 源文件 存放需要放到田字格中的汉子
	 */
	private String srcFilePath;

	/**
	 * 保存文件名
	 */
	private String desFilePath;

	/**
	 * 是否有错误
	 */
	private Boolean haveError = false;

	/**
	 * 错误信息 haveError == true 时获取
	 */
	private List<String> errorMsgs = new ArrayList<String>();
	
	public static Params valueOf(String[] args) {
		Params ret = new Params();
		ret.readParams(args);
		return ret;
	}

	protected void readParams(String[] args) {
		for (String value : args) {
			readSrcFilePath(value);
			readDesFilePath(value);
		}
	}

	/**
	 * 读取来源文件 格式 -source:filePath
	 * 
	 * @param value
	 */
	protected void readSrcFilePath(String value) {
		ParamParser aParamParser = ParamParser.parse(value,PARAM_SOURCE_FILE_PATH_PREFIX);
		if (aParamParser.getSuccess()) {
			this.srcFilePath = aParamParser.getValue();
		}
	}

	/**
	 * 读取目标文件 格式 -des:filePath
	 * 
	 * @param value
	 */
	protected void readDesFilePath(String value) {
		ParamParser aParamParser = ParamParser.parse(value,PARAM_DESTINATION_FILE_PATH_PREFIX);
		if (aParamParser.getSuccess()) {
			this.desFilePath = aParamParser.getValue();
		}
	}

	public String getSrcFilePath() {
		return srcFilePath;
	}

	public void setSrcFilePath(String srcFilePath) {
		this.srcFilePath = srcFilePath;
	}

	public String getDesFilePath() {
		return desFilePath;
	}

	public void setDesFilePath(String desFilePath) {
		this.desFilePath = desFilePath;
	}

	public Boolean getHaveError() {
		return haveError;
	}

	public void setHaveError(Boolean haveError) {
		this.haveError = haveError;
	}

	public List<String> getErrorMsgs() {
		return errorMsgs;
	}

	public void setErrorMsgs(List<String> errorMsgs) {
		this.errorMsgs = errorMsgs;
	}
	
}
