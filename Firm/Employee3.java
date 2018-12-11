//********************************************************************
//  Employee3.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 10.2 
//********************************************************************

public class Employee3 extends StaffMember3
{
   public final int STANDARD_VACATION = 14;

   protected String socialSecurityNumber;
   protected double payRate;
   
   //-----------------------------------------------------------------
   //  Constructor: Sets up this employee with the specified
   //  information.
   //-----------------------------------------------------------------
   public Employee3 (String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate)
   {
      super (eName, eAddress, ePhone);

      socialSecurityNumber = socSecNumber;
      payRate = rate;
   }

   //-----------------------------------------------------------------
   //  Returns information about an employee as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();

      result += "\nSocial Security Number: " + socialSecurityNumber;

      return result;
   }

   //-----------------------------------------------------------------
   //  Returns the pay rate for this employee.
   //-----------------------------------------------------------------
   public double pay()
   {
      return payRate;
   }

   //-----------------------------------------------------------------
   //  Returns the number of vacation days for this employee.
   //-----------------------------------------------------------------
   public int vacation()
   {
      return STANDARD_VACATION;
   }
}
