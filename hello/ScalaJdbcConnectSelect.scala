import java.sql.DriverManager
import java.sql.Connection

/**
 * A Scala JDBC connection example by Alvin Alexander,
 * http://alvinalexander.com
 */
object ScalaJdbcConnectSelect 
{

  def main(args: Array[String]) 
  {
    // connect to the database named "mysql" on the localhost
    val driver = "oracle.jdbc.driver.OracleDriver"
 
     // Replace the fqdns name and the instance in the input url
    //val url = "jdbc:oracle:thin:@ldap://dns:389/instance,cn=OracleContext,dc=research,dc=pharma"
    

	val url = readLine("Enter JDBC url ? ")
    
	val username = readLine("Enter username ? ")
	val password = readLine("Enter password ? ")

    // there's probably a better way to do this
    var connection:Connection = null

    try 
	{
      // make the connection
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      // create the statement, and run the select query
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT EMPID,EMPLOYEEFIRSTNAME FROM EMPLOYEE")
      while ( resultSet.next() ) {
        val host = resultSet.getString("EMPID")
        val user = resultSet.getString("EMPLOYEEFIRSTNAME")
        println("EMPID = " + host + ", EMPLOYEEFIRSTNAME = " + user)
      }
    } 
	catch 
	{
      case e => e.printStackTrace
    }
    
	connection.close()
  }

}