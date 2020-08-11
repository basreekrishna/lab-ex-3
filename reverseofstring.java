/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author sksba
 */
public class reverse string {
      
  /**
   * @param args the command line arguments
   */
class ReverseofaString
{
	public static void main(String[] arg)
	{
	ReverseofaString rev=new ReverseofaString();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String  str=sc.nextLine();	
	System.out.println("Reverse of a String  is : "+rev.reverse(str));
	}
static String reverse(String s)
	{
	String rev="";
	for(int j=s.length();j>0;--j)
	{
	rev=rev+(s.charAt(j-1)); 
	}
	return rev;
	}
}