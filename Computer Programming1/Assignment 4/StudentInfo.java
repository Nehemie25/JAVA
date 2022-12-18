

/*NEHEMIE NGUIMBOUS T00694095
 * Due date: Friday 22 july 2022 at 9;30 am
 * Program description:
 * read all the Student informations examples and test their format
 *  extract their names program and student number 
 *  verifies their validity
 *  throw Exception if a specific problem occurs
 *  write wrong students info in an  invalidOutputFile with the corresponding error description
 *  write correct students info in the validOutputFile
 */



import java.util.Scanner;     //import the Scanner class
import java.io.*;            // import the I/O package

public class StudentInfo 
{
     
     public static void main (String [] args) throws IOException, StringIndexOutOfBoundsException, NumberFormatException     //throw some java Exceptions     
     {
          String inputNames ="inputs.txt";          //assign our input file path in the inputNames variable
          File inputs = new File (inputNames);       // create a new file with the previous path
          Scanner inputFile = new Scanner (inputs);     // declare a new file reader
          String studentInfo = "", invalidOutputName = "invalidOutput.txt", validOutputName = "validOutput.txt", name = "";  
          int comaPos1 = 0,  comaPos2 = 0, number = 0;
          
          
          char program = 0;
          
          // declare two FileWriter objects in order to add information  to our files without deleting the previous ones
          
          FileWriter invalidFwrite = new FileWriter (invalidOutputName, true), validFwrite = new FileWriter (validOutputName, true);     
          PrintWriter invalidOutputFile = new PrintWriter (invalidFwrite), validOutputFile = new PrintWriter (validFwrite);
          
          
          
          while (inputFile.hasNext())     // run untill there is no more rows in the file
          {
               
               try         // use to catch all the possible Exceptions that the program could throw and deal with it
               {
                    
                    studentInfo = inputFile.nextLine();     // assign the whole line to our studentInfo variable
                    comaPos1 = studentInfo.indexOf (",");     // get the first comma's position in our studentInfo
                    if (comaPos1 != -1)                         // in case there is actually a comma do this
                    {
                         
                         comaPos2 = studentInfo.indexOf (",", comaPos1 + 1);     // get the position of the second comma
                         
                         if (comaPos2 != -1)     // in case there is actually a comma do this
                         {
                              name = studentInfo.substring (0, comaPos1);                                         // extract the text from the start to the first comma position (excluded)
                              // extract the text from the comma position + 1  to the end 
                              number = Integer.parseInt (studentInfo.substring (comaPos1 + 1, comaPos2));     // convert the student number into its integer equivalnet 
                              
                              if (!(number >= 1 && number <= 6000))     // check if the Tudent number is in the right range
                              {
                                   throw new InvalidStudentNumberException(number + " is a wrong student number, students numbers must be between 1 and 6000");     // throw an Exception if not
                              }
                              else
                              {
                                   program = studentInfo.charAt (comaPos2 + 1);     // get the program character
                                   
                                   
                                   if (program != 'B' && program != 'C' && program != 'S' && program != 'T')     // check the value of the program character
                                   {
                                        throw new InvalidProgramException(program + " is an invalid program: the valid programs are B, C, S, T" );  // throw an Exception in case the program character is incorrect
                                   }
                                   else
                                   {
                                        validOutputFile.println (studentInfo + " is  valid:  name: " + name + " number: " +  number   + " program: " + program);     // write the valid inputs in the validOutputFile
                                   }
                                   
                              }
                              
                              
                         }
                         else
                         {
                              throw new MissingCommaException(studentInfo + " has the wrong format. this is an example of the right format: NEHEMIE NGUIMBOUS,2548,C");     // throw an Excetion in case there is no second comma
                         }
                    }
                    else
                    {
                         throw new MissingCommaException(studentInfo + " has the wrong format. this is an example of the right format: NEHEMIE NGUIMBOUS,2548,C");     // throw an Exception if there is no commas
                    }
               }
               
               
               catch (MissingCommaException e)     // catch the MissingCommaException and write a custom error message for it in the invalidOutputFile
               {
                    
                    invalidOutputFile.println (e.getMessage());
                    
               }
               catch (InvalidProgramException e)            // catch the InvalidProgramException and write a custom error message for it in the invalidOutputFile
               {
                    invalidOutputFile.println (studentInfo + " " + e.getMessage());
                    
               }
               catch (InvalidStudentNumberException e)     // catch the InvalidStudentNumberException and write a custom error message for it in the invalidOutputFile
               {
                    invalidOutputFile.println (studentInfo + " " + e.getMessage());
                    
               }
               catch (StringIndexOutOfBoundsException e)     // catch the StringIndexOutOfBoundException
               {
                    invalidOutputFile.println (studentInfo + " missing program in your student information");
                    
               }
               catch (NumberFormatException e)     // catch the NumberFormatException and write a custom error message
               {
                    invalidOutputFile.println (studentInfo + " Wrong student number format");
               }
               
               
          }
          invalidOutputFile.close();     //close the invalidOutputFile
          
          validOutputFile.close();     // close the validOutputFile
          
          
          
          
          
          
     }
     
}
