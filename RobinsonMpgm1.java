Java Programming Requirements

Programming Rules for this class:
 1 - At the beginning of the file, the program must be documented, see program example below.
 2 - Use camelCasing to name the class, methods, and variables.
 3 - All global variables must declared and initialized at the beginning of the
     program after the import statements, if any.
 4 - The Java class begins and ends in column 0.
 5 - The methods begin and end in column 5.
 6 - The main function must be the last method in the program.
 7 - All other methods must be between the class beginning and the main method.
 8 - The main method is for creating and initiallizing variables, calling methods, 
     and terminating the program.
 9 - All pair of { } must be aligned in the same column for all programming sections,
     such as methods, if, while, for, etc.
10 - All paragraphs must be indented 4 (four) spaces from the previous outer section.
11 - Documment your program as much as possible.
12 - Leave two spaces between each method.


Program example:


/********************************************************************* 
    Author     : Your Name 
    Course     : Course Name and Times 
    Professor  : Michael Robinson 
    Program    : Program Name and Number
    Purpose    : A brief description of the program 
    Due Date   : mm/dd/yyyy 

    Certification: 
    I hereby certify that this work is my own and none of it is the work of any other person. 


    ..........{ your signature }.......... 
    
*********************************************************************/      

    
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;



public class RobinsonMpgm1
{

    //global variables
    float  gpa           = 4.00;
    int    credits       = 3;
    String className[20] = "Java Programming";


    public static void indentationSample() //creating and loading a 2 dim array of ints
    {                                      //to show indentation 
        int x = 0;
        int y = 0;
    
        int theArray[10][10];
    
        int rows = 0;
        int cols = 0;
    
        for(x=0; x<10; x++)
        {
            for(y=0; y<10; y++)
            {
                theArray[x][y] = (x+y);
                printf( "[%2d] ", theArray[x][y] );    
              
                if( (x % 5) != 0 )
                {
                    rows += theArray[x][y];
                }
                else if( (y % 5) == 0 ) 
                {
                    cols += theArray[x][y];
                }
            }
            printf("\n");
        }
        
        printf( "\n Total in rows = %d\n Total of cols = %d\n", rows, cols );
    
    }//end of public static void indentationSample() //creating and loading a 2 dim array of ints
     
     
    public static void printTheData( float gpa, int credits, char className[20], char myName[20], char myMajor[10] )
    {
        //printing all the data received, one field per line/row
        printf( "My name is %s \n", myName );
        printf( "My major is %s \n", myMajor );
        printf( "My gpa is %.2f \n", gpa );
        printf( "My current class is %d credits\n", credits );
        printf( "its name is %s \n", className );
        printf( "With %d programs\n\n", PROGRAMS );

        //printing all data received, in one line/row
        printf( "My gpa is %.2f My current class is %d credits and its name is %s My name is %s and my major is %s with %d programs\n\n", gpa, credits, className, myName, myMajor, PROGRAMS );
    
    }//end of public static void printTheData( float gpa, int credits, char className[20], char myName[20], char myMajor[10] )
 

    public static void main( String arg[] )
    {
        char myName[20]  = "Joe Smith"; //creating a char array 
        char myMajor[10] = "CS/IT";     //creating a char array 

        //calling a function passing 5 variables by value
        printTheData( gpa, credits, className, myName, myMajor );
          
        //calling a function
        indentationSample();
            
    }//end of public static void main( String arg[] )

}//end of public class RobinsonMpgm1
