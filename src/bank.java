

public class bank {
    static void countMoney(double vklad,double procent){// параметры метода

        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        for(int year=1;year<=5;year++)
            vklad += vklad * procent;
        
        System.out.println(df.format(vklad));
    }
        public static void main(String[] args){
            countMoney(179,0.12);

        }
    }

