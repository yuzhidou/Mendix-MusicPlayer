// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package databaseconnector.actions;

import java.util.List;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;
import com.mendix.webui.CustomJavaAction;
import databaseconnector.impl.JdbcConnector;

/**
 * For a more detailed documentation, please visit the website at
 * https://docs.mendix.com/appstore/connectors/database-connector
 * 
 * This Java action provides a consistent environment for Mendix projects to
 * perform an arbitrary SELECT SQL query on external relational databases.
 * 
 * Do not use this Java action for INSERT, UPDATE, DELETE or DDL queries. This
 * action returns a list of Mendix objects based on the JDBC result set.
 * 
 * The JDBC drivers for the databases you want to connect to must be placed
 * inside the userlib directory of your project.
 * 
 * Note: Proper security is required when manually composing the query text to
 *       avoid SQL injection.
 * 
 * @param jdbcUrl A database JDBC URL address that points to your database.
 * 
 * @param userName The user name for logging into the database.
 * 
 * @param password The password for logging into the database.
 * 
 * @param sql The SELECT query to be performed.
 * 
 * @param resultObject An instance of the resulting object. This instance is used
 *                     only for defining the type of object to be returned.
 * 
 * @return Result of the query as a list of mendix objects.
 */
public class ExecuteQuery extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String jdbcUrl;
	private java.lang.String userName;
	private java.lang.String password;
	private java.lang.String sql;
	private IMendixObject resultObject;

	public ExecuteQuery(IContext context, java.lang.String jdbcUrl, java.lang.String userName, java.lang.String password, java.lang.String sql, IMendixObject resultObject)
	{
		super(context);
		this.jdbcUrl = jdbcUrl;
		this.userName = userName;
		this.password = password;
		this.sql = sql;
		this.resultObject = resultObject;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		IMetaObject metaObject = resultObject.getMetaObject();
		List<IMendixObject> resultList = connector.executeQuery(this.jdbcUrl, this.userName, this.password,
				metaObject, this.sql, this.getContext());
		if (logNode.isTraceEnabled()) logNode.trace(String.format("Result list count: %d", resultList.size()));

		return resultList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ExecuteQuery";
	}

	// BEGIN EXTRA CODE
	private final ILogNode logNode = Core.getLogger(this.getClass().getName());

	private final JdbcConnector connector = new JdbcConnector(logNode);
	// END EXTRA CODE
}
