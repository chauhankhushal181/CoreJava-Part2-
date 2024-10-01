enum status {
    Running, Failed , Pending ,Success;

}
public class EnumIf55 {
    public static void main(String[] args) {
        status s = status.Failed;

        switch (s){
            case Running:
                System.out.println("All good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Pleas wait");
                break;

            default:
                System.out.println("Done");
                break;
        }


        if(s == status.Running )
            System.out.println("All Good");
        else if (s ==status.Failed)
            System.out.println("Try Again");
        else if (s == status.Pending)
            System.out.println("Pleas wait");
        else
            System.out.println("Done");
        }
    }

