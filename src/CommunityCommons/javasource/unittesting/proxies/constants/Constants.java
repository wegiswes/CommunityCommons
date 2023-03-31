// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package unittesting.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	/**
	 * @deprecated
	 * The default constructor of the Constants class should not be used.
	 * Use the static get methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Constants() {}

	// These are the constants for the UnitTesting module

	/**
	* Set this value to 'True' when you would like to include your available JUnit tests to be found and listed. Leave 'False' otherwise
	*/
	public static boolean getFindJUnitTests()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("UnitTesting.FindJUnitTests");
	}

	public static boolean getRemoteApiEnabled()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("UnitTesting.RemoteApiEnabled");
	}

	public static java.lang.String getRemoteApiPassword()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("UnitTesting.RemoteApiPassword");
	}
}