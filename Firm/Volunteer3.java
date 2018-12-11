//********************************************************************
//  Volunteer3.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 10.2 
//********************************************************************

public class Volunteer3 extends StaffMember3
{
   //-----------------------------------------------------------------
   //  Constructor: Sets up this volunteer using the specified
   //  information.
   //-----------------------------------------------------------------
   public Volunteer3 (String eName, String eAddress, String ePhone)
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

   //-----------------------------------------------------------------
   //  Returns zero vacation days for this volunteer.
   //-----------------------------------------------------------------
   public int vacation()
   {
      return 0;
   }
}
