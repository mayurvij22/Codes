//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int l=0;
                  for(int i =1;i<=5;i++){
                      for(int j =5;j>=i;j--){
                           System.out.print(" ");
                      }

                      for (int j = 1; j <i ; j++) {
                          System.out.print(j);
                      }
                      for(int j=i;j>0;j--){
                          System.out.print(j);
                      }
                      System.out.println(" ");
                  }


        }
    }