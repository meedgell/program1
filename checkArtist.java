public boolean checkArtist(Artist a1)
  {
    private boolean unique;
    private int i;
    unique = true;
    i = 0;
    
    while (unique && i <= myArtists[].length)
       {
         unique=!a1.equals(myArtists[i]);
         i++;
       }
    
    return unique
      
  }