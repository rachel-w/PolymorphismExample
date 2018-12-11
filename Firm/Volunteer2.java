//********************************************************************
//  Volunteer2.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 10.1 
//********************************************************************

public class Volunteer2 extends StaffMember2
{
   //-----------------------------------------------------------------
   //  Constructor: Sets up this volunteer using the specified
   //  information.
   //-----------------------------------------------------------------
   public Volunteer2 (String eName, String eAddress, String ePhone)
   {
      super (eName, eAddress, ePhone);
   }

   //-----------------------------------------------------------------
   //  Returns a zero pay value for this volunteer.
   //-----------------------------------------------------------------
   public double pay()
   {
      return 0.0;
   }
}
