package com.test.demo.util.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/**
 * 多数据源配置
 * @version v1.0
 * @author Administrator
 * @date 2018年1月1日
 */
/*public class MultipleDataSource extends AbstractRoutingDataSource{
	private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();
	
	public static String H5DB = "h5DataSource";
	public static String WXDB = "wxDataSource";
	
	public static void setDataSourceKey(String dataSource) {
	        dataSourceKey.set(dataSource);
    }
	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return null;
	}


}*/
