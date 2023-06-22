public class App {
    public static void main(String[] args) throws Exception {
        int j=1;
        System.out.println("Los siguientes numeros son pares");
        for(int i=1; i<=10 ; i++){
            if ((i%2)==0)
            System.out.println(i);    
        }
        
        System.out.println("------------\n" + "Los siguientes numeros son impares");
        while(j <= 10){
            if ((j%2)!=0)
                System.out.println(j);
            j++;
        }
    }
}
