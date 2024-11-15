//It Does Not Handle Time Limit Exceeded(Long String Input) 


public class LeetCode6 {
    public static void main(String args[]){
        String s = convert("UmangJadavShaileshBhai",4);
        if(s!=null){
            System.out.println("Output = "+s);
        }
    }
    public static String convert(String s, int numRows) {
        int row = numRows;
        int col = s.length();
        String str[][] = new String[ row ][ col ];
        int i=0,j=0;
        for(i=0;i<row;i++) {
            for (j = 0; j < col; j++) {
                str[i][j] = null;
            }
        }
        int r=0,c=0;
        boolean goDown = true;

        for(char ch : s.toCharArray()){
            str[r][c] = String.valueOf(ch);
            if(goDown){
                r++;
                if(r == numRows){
                    goDown = false;
                    r -= 2;
                    c++;
                }
            }else {
                r--;
                if(r<0){
                    goDown = true;
                    r +=2;
                }else {
                    c++;
                }
            }
        }

        String res = "";
        for(i=0;i<row;i++){
            for ( j=0;j<col;j++){
                if(str[i][j]!= null){
                    System.out.print("\t"+str[i][j]);
                    res += str[i][j];
                }else{
                    System.out.print("\t");
                }

            }
            System.out.print("\n");
        }

        return res;
    }
}
