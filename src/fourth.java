/**
 * Created by Катя on 29.10.2016.
 */
public class fourth {
    public static double Fundation (double withdrawal, double balance){
        return (withdrawal+balance) ;
    }
    public static void main (String[] arg){
        double[] balances ={1200,250,2000,500,3200};
        String[] ownerNames={"Kate","Oleg","Marina","Anna","Alex"};
        double[] withdrawals={10,3000,60,1000,200};
        double[] fundation = new double[balances.length];
        for (int i=0; i<balances.length; i++){
            fundation[i]=  Fundation(withdrawals[i],balances[i]);
        }
        for(int i=0; i<ownerNames.length;i++){

                System.out.println();
                System.out.println(ownerNames[i]);
                System.out.println("Balance after funding: " + fundation[i]);
            }

    }
}
