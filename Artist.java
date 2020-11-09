/*
Artist.Java
Vince Forrester
Artist Class of Media Library Application
11/08/2020
 */

//package artist;

public class Artist {
    
private String first;
private String last;
private Date birthDate;
private String twitterHandle;
private String url;

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
first="";
last="";
//birthDate;
twitterHandle="";
url="";
}

//Mutators

///...

//
public void getArtist()
{
    // Allows data input from keyboard
    //probably not needed
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
  

    
}
