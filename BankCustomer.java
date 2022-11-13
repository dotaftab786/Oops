import java.util.*;
//Is this possible to put different color adjacent to each matrices.
public class BankCustomer {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
		a.add("B..R");
		a.add("RB.R");
		a.add("...B");
		int n = a.size();
        int m = a.get(0).length();
		
    char[][] chr = new char[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
            chr[i][j] = a.get(i).charAt(j);
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(chr[i][j] == '.')
                continue;
            else{
                char ch = chr[i][j];
                char ach = ch == 'B' ? 'R' :'B'; 
                int dx[] = {-1,0,1,0};
                int dy[] = {0,1,0,-1};
                for(int k=0;k<4;k++){
                    if(i+dx[k] < 0 || j+dy[k] < 0 || i+dx[k] >= n || j+dy[k] >= m || chr[i+dx[k]][j+dy[k]] == ach)
                        continue;
                    else{                                    
                            if(chr[i+dx[k]][j+dy[k]] == ch){
                                System.out.println("Not possible");
                                 return;
                            }
                            else if(chr[i+dx[k]][j+dy[k]] == '.')
                              chr[i+dx[k]][j+dy[k]] = ach;
                            else
                                continue;
                        }
                    }
                }
            }
        }
        System.out.println("Possible");
    }
}