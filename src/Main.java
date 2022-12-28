public class Main {
    public static void main(String[] args) {
        String[][] sekizYap=new String[7][4];
        for (int i=0;i<sekizYap.length;i++){
            for (int j=0;j<sekizYap[i].length;j++){
                if (i==0 || i==3 || i==6){
                    sekizYap[i][j]="*";
                }else if (j==0 || j==3){
                    sekizYap[i][j]="*";
                }else {
                    sekizYap[i][j]=" ";
                }
            }
        }
        for (String[] row:sekizYap){
            for (String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}