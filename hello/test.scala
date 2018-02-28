import java.text.SimpleDateFormat 

object Test 
{
  def main(args: Array[String]) 
  {
 
    val inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
	//val outputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm")
	val outputFormat = new SimpleDateFormat("dd/yyyy HH:mm")

	val date = "2015-01-31 12:34:00"

	val formattedDate = outputFormat.format(inputFormat.parse(date))

	println(formattedDate) // prints "31/01/2015 12:34"
	Console.out.flush
	
	
	// readLine lets you prompt the user and read their input as a String
	val name = readLine("What's your name? ")
	//println("\n")
	val nadme = readLine("What's your nadme? ")

	// readInt lets you read an Int, but you have to prompt the user manually
	println("How old are you? ")
	val age = readInt()

	
	// you can also print output with printf
	println(s"Your name is $name and you are $age years old.")
	
	
	// create printstream object
    //java.io.PrintStream ps = new PrintStream(System.out);
    //ps.flush();
	  
	Console.flush(); 
	
	/*
	val scanner = new java.util.Scanner(System.in)
	print("Where do you live? ")

	val input = scanner.nextLine()
	print(s"I see that you live in $input")
	

	*/
  }

}