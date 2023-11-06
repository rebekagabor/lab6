package prob2;

public class CalculAriaPerimetru {
    public static void main(String[] args)
    {
        double laturaPatrat=5.0;
        double lungimeDreptunghi=6.0;
        double latimeDreptunghi=4.0;
        double ariaPatrat=laturaPatrat*laturaPatrat;
        double perimetruPatrat=4*laturaPatrat;
        double ariaDreptunghi=lungimeDreptunghi*latimeDreptunghi;
        double perimetruDreptunghi=2*(lungimeDreptunghi+latimeDreptunghi);

        System.out.println("aria patratuui este:"+ariaPatrat);
        System.out.println("aperimetrul patratului  este:"+perimetruPatrat);
        System.out.println("aria dreptunghiului este:"+ariaDreptunghi);
        System.out.println("perimetrul dreptunghiului  este:"+perimetruDreptunghi);
    }
}
