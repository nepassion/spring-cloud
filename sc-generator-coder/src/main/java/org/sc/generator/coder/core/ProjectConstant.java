package org.sc.generator.coder.core;

<<<<<<< HEAD
import org.sc.generator.coder.App;
=======
import org.sc.generator.coder.DBServer;
>>>>>>> new version

/**
 * 项目常量
 */
public final class ProjectConstant {
<<<<<<< HEAD
	public static final String	BASE_PACKAGE				= App.class.getPackage().getName();	// 项目基础包名称，根据自己公司的项目修改

	public static final String	MODEL_PACKAGE				= BASE_PACKAGE + ".model";			// Model所在包
	public static final String	MAPPER_PACKAGE				= BASE_PACKAGE + ".dao";			// Mapper,XML所在包
	public static final String	SERVICE_PACKAGE				= BASE_PACKAGE + ".service";		// Service所在包
	public static final String	SERVICE_IMPL_PACKAGE		= SERVICE_PACKAGE + ".impl";		// ServiceImpl所在包
	public static final String	CONTROLLER_PACKAGE			= BASE_PACKAGE + ".web";			// Controller所在包

	public static final String	MAPPER_INTERFACE_REFERENCE	= BASE_PACKAGE + ".core.Mapper";	// Mapper插件基础接口的完全限定名
=======
	public static final String	BASE_PACKAGE				= DBServer.class.getPackage().getName();	// 项目基础包名称，根据自己公司的项目修改

	public static final String	MODEL_PACKAGE				= BASE_PACKAGE + ".model";					// Model所在包
	public static final String	MAPPER_PACKAGE				= BASE_PACKAGE + ".dao";					// Mapper,XML所在包
	public static final String	SERVICE_PACKAGE				= BASE_PACKAGE + ".service";				// Service所在包
	public static final String	SERVICE_IMPL_PACKAGE		= SERVICE_PACKAGE + ".impl";				// ServiceImpl所在包
	public static final String	CONTROLLER_PACKAGE			= BASE_PACKAGE + ".web";					// Controller所在包

	public static final String	MAPPER_INTERFACE_REFERENCE	= BASE_PACKAGE + ".core.Mapper";			// Mapper插件基础接口的完全限定名
>>>>>>> new version
}
