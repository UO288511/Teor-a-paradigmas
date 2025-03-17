package fan.monolithic;

public class MonolithicFan {

    private int currentState; // estado actual

    public MonolithicFan()
    {
        currentState = 0;  // estado inicial
    }
    
    public void pull() // transiciones
    {
        if (currentState == 0)
        {
            currentState = 1;
            System.out.println("   changing to low speed");
        }
        else if (currentState == 1)
        {
            currentState = 2;
            System.out.println("   changing to medium speed");
        }
        else if (currentState == 2)
        {
            currentState = 3;
            System.out.println("   changing to high speed");
        }
        else
        {
            currentState = 0;
            System.out.println("   switching off");
        }
    }
}

