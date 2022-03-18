public class Random {
    public static void main(String[] args){
       // double a = Math.random(); случайные числа от [0 ;1)
       // double a = Math.random()*3;// [0;3)
        // double a = Math.random()+2;// числа от [2до 3) (0+2 -нижняя граница : 1+2=3 -верхняя граница)
        int a = (int) ( Math.random() * 3 );// генерация целого числа [0;2] или [0;3)

        System.out.println (a);
    }
}
