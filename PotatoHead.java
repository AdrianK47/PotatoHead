public class PotatoHead
{
    private String earColor;
    private boolean glasses;
    private int numberOfArms;
    private String noseColor;

    public PotatoHead() 
{ 
	earColor = "black";
	glasses = true;
	numberOfArms = 2;
	noseColor = "orange";
}
public PotatoHead(String w, boolean x, int y, String z) 
{ 
	earColor = w;
	glasses = x;
	numberOfArms = y;
	noseColor = z;
} 
public String getearColor() 
{ 
    return earColor; 
} 

public boolean getglasses() 
{ 
    return glasses; 
} 

public int getnumberOfArms() 
{ 
    return numberOfArms; 
} 

public String getnoseColor() 
{ 
    return noseColor; 
}
public void setearColor(String w) 
{ 
    earColor = w; 
} 

public void setglasses(boolean x) 
{ 
    glasses = x; 
} 

public void setnumberOfArms(int y) 
{ 
    numberOfArms = y; 
}

public void setnoseColor(String z) 
{ 
    noseColor = z; 
}
public String toString() 
{ 
    return "A message that describes the object and its instance variables"; 
}
public static void main (String [] args) 
{ 
    PotatoHead object = new PotatoHead();
    PotatoHead object2 = new PotatoHead("pink",false,4,"red");
    String ear = object2.getearColor();
    boolean glasses = object2.getglasses();
    int arms = object.getnumberOfArms();
    object.setnoseColor("black");
    String nose = object2.getnoseColor();
} 


}