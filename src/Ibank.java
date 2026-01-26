import java.util.*;

class Ibank {

    int balance = 0;
    Ibank(){
        this.balance=0;
    }

    public void seebalance(){
        System.out.println(balance);
    }
    public void withdraw(int amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println(balance);
        }
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println(balance);
    }


}

class Maina{
    public static boolean isnum(String t){
        try{
            Integer.parseInt(t);
            return true;
        }
        catch(Exception e){
            return false;
        }

    }


    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        Ibank bank=new Ibank();
        //int n=Integer.parseInt(s.nextLine());
        int n= s.nextInt();
        s.nextLine();
        String[] ip = new String[n];
        for(int i=0;i<n;i++) ip[i]=s.nextLine();
        try{
            for(int i=0;i<n;i++){

                String input = ip[i];
                String[] parts=input.split(" ");
                int num=-1;
                for(String part:parts){
                    if(isnum(part.trim())){
                        num=Integer.parseInt(part.trim());
                        break;
                    }

                }
                System.out.println(input);

                if(input.contains("see")||input.contains("show")){
                    bank.seebalance();
                }else if(input.contains("deposit")||input.contains("put")||input.contains("invest")||input.contains("transfer")){
                    bank.deposit(num);
                }else if(input.contains("withdraw")||input.contains("pull")&&(num!=-1)){
                    bank.withdraw(num);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
            Math.random();
        }

    }
    List<Integer> l = new ArrayList<>();

}
/*
5
I want to deposit 2396 dollars
I want to transfer 3017 dollars to my account
I want to pull 2300 dollars
I want to deposit 3980 dollars
I want to transfer 2811 dollars to my account
 */