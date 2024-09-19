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
    public void talk(){
        System.out.println("My name is Schmerenc Schmadasz");
    }
    public String amICool(boolean x){
        if (x){
            return "I am cool";
        }
        else{
            return "I am not cool";
        }
    }
    public void curse(){
        System.out.println("Ḫ̴̡̧̬͇̘̝̘̣̼̎͆̈́̍̊̉̅̓̃̓̀̒ȩ̷̢̢̨̛͈͉͙̞̩̣̜͎̭̲̟̻̠͛͑́̍̌̈́̽̌͊͠l̴̼͐̈́̐̅͑̈́̈́͘͝ḻ̵̛̖̯̘̼̣͂̐̋̐̂ǫ̸͔̘͖̲̣̞̥̭̖̦͓̟͇̠̀̊̑̿͐͊̂̌̍̓͝ͅ ̸̨͓̜͙̩͎͎̣̖͔̼͇̖͓̜͊͌͛̈́I̵̛̬̰̦̝̫͚͔͙̗͎̝̻̱̋́́ ̷̡͙̜̲̻̭͎̪͚͂ͅa̵̙͋̽͑̀̍͗̎̎͘m̵̹̟̲̣̭̼̣̬̙̲̼̮̰̮̍͌̇͊ ̸̩̯̬̞̺̫̺̼̻̝̗͒̄̆͂͠ͅă̷̛͔͙̙̥͖̬͍͔̈́͐́̉̇̆̀̾̈́͗̕͜ͅl̶̨͍͎̜̯̻̟̳̬̭̗̫̬̘̻͆̀́̈́͆̈́̒̇ͅͅi̴͈͇͐̆͆v̶͓͈̰͈̩̞̞̭̬̂e̸̛͍̞̤̙̞̖̣͈̖̪̲̭͐͗̉́̾̐̎̏͛̎͝͝ͅ,̶͙͙̦̩̣̖̠͖͓̥͊̎̈́͋͐̌̍̃̀͗̍͊̀͊̕̕ ̸̡̖̰̱̠͊̀́̊H̵̨͍̩̥̣̤̰̙͖̟̥̩̅̒̀̃̾̽́̐̈́̽̔̀̓̐͗̚È̸̤̇̂͋̂͠L̸̡̡̠̝̝͇̩̞̤̗̥͎͎̮̭͍̓̈́͒̄̏̅̐̑̀͠P̷̘̍̊͐͑́̃ ̶̛͇̉̎̐̎̏́̊͋͆̕M̸̧̯̭̦͓̫̲̳͙̫̅̐E̸̢̳͊̎̈̏̉̽͐͝");
    }
    public String toString() 
    { 
        return "The color of my ears is " + earColor + ". The number of arms is " + numberOfArms + ". The fact that I'm wearing glasses is " + glasses + ". The color of my nose is " + noseColor + "."; 
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
        System.out.println(object2.toString());
        object.talk();
        System.out.println(object.amICool(true));
        object.curse();
    } 
}