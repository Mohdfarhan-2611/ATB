package October.October_11102024_Encapsulation.AccessModifier.Police;

public class SeniorCop {

    private int gun;
    private String idCard;

    public SeniorCop(int gun) {
        this.gun = gun;
    }

    protected void CanIShoot()
    {
        System.out.println("Yes you can");
    }

    public static void main(String[] args) {

        SeniorCop cop = new SeniorCop(10);
        cop.CanIShoot();
    }
}
