/*
Artist.Java
Vince Forrester
Artist Class of Media Library Application
11/08/2020
 */

//package artist;

import java.util.Scanner;
import java.io.IOException;

public class Artist {
    
private String first;
private String last;
private Date birthDate=new Date();
private String twitterHandle;
private String url;

private Boolean go;

Scanner sc1 = new Scanner(System.in);

public Artist (String f, String l,Date bD,String tH,String u)
{
  first=f;
  last=l;
  birthDate=bD;
  twitterHandle=tH;
  url=u;   
}

//Constructors

public Artist (String f, String l,Date bD,String u)
{
  first=f;
  last=l;
  birthDate=bD;
  twitterHandle="";
  url=u;
}

public Artist (String f, String l,Date bD)
{
first=f;
last=l;
birthDate=bD;
twitterHandle="";
url="";
}

public Artist (String f, String l)
{
first=f;
last=l;
//birthDate;
twitterHandle="";
url="";
}

public Artist (String f)
{
first=f;
last="";
//birthDate;
twitterHandle="";
url="";
}

public Artist ()
{



go=false;

while (!go)
{try
{
    System.out.println("Date of Birth(mm/dd/yyyy):");
    birthDate.getDate();
    go=true;
}
    catch (Exception ex)
{
    System.out.println(ex.getMessage());
    System.err.println(ex);
    go=false;
    System.out.println("Illegal value entered please re-enter");
}
}                 
                   
                                  
System.out.print("Twitter Handle:");
twitterHandle=sc1.next();

System.out.print("URL:");
url=sc1.next();
}


        
//accessors

public String getFirst()
{
    return first;
}
        
        
public String getLast()
{
    return last;
}


        
public Date getBirthDate()
{
    return birthDate;
}

public String getTwitterHandle()
{
    return twitterHandle;
}
        
public String getUrl()
{
    return url;
}

public String toString()
{
    return "Name: " + first + " " + last + "\nBirthdate: " + birthDate +"\ntwitterHandle: "+twitterHandle+"\nURL: "+url;
}
  
//make equals on last & first name and dob so user won't have to enter in everything every time 
public boolean equals(Artist a1)
    {
     return ( birthDate.equals(a1.getBirthDate()) && last.equals(a1.getLast()) && first.equals(a1.getFirst())&& url.equals(a1.getUrl())&& twitterHandle.equals(a1.getTwitterHandle()));
    }
    
}