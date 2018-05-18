package com.java.oa.action;

import java.lang.reflect.ParameterizedType;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<E> extends ActionSupport implements ModelDriven<E>{
	
	private Class classt;
	private E e;
 
	public BaseAction(){
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();//泛型
		this.classt = (Class)type.getActualTypeArguments()[0];//实际类型 ==》 类
		try {
			this.e = (E)this.classt.newInstance();//实际类型 ==> 对象
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	public E getModel() {
		return this.e;
	}
	/* 跳转了列表页面  */
	public static final String LISTACTION = "listAction";
	public static String listAction = LISTACTION;
	/* 跳转到修改界面  */
	public static final String UPDATE_UI = "updateUI";
	public static String updateUI = UPDATE_UI;
	/* 跳转到添加的页面  */
	public static final String ADD_UI = "addUI";
	public static String addUI = ADD_UI;
	/* 由action跳转到action */
	public static final String ACTION2ACTION = "action2action";
	public static String action2action = ACTION2ACTION;
}