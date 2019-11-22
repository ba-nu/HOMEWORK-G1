
package testclass;

import java.util.Scanner;
public class TestClass {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int N,M,K;
		
		N=sc.nextInt();
		M=sc.nextInt();
		K=sc.nextInt();
		
		int []ar=new int[N];
		for(int i=0;i<N;i++){
			ar[i]=sc.nextInt()-1;
		}
		
		boolean [][]classRoom=new boolean[M][K];
		int row=0; 
		boolean flag=false;
		
		int count=0;
		for(int i=0;i<N;i++){
			row=ar[i];  flag=false;
			for(int j=0;j<K;j++){
				if(!classRoom[row][j]){
					classRoom[row][j]=true;
					count++;
					flag=true;
					break;
				}
			}//end of desired seat 
			
	if(!flag){
	if(row<M-1){
	  for(int m=row+1;m<M;m++ ){
		for(int n=0;n<K;n++ ){
	if(!classRoom[m][n]){
		classRoom[m][n]=true;
		flag=true;
		break;
	}
	}
	if(flag)
            break;
	}
					
	}
        else if(row==M-1){
	     for(int m=0;m<1;m++ ){
	     for(int n=0;n<K;n++ ){
	 if(!classRoom[m][n]){
	    classRoom[m][n]=true;
	       flag=true;
		break;
	}
	}
	  if(flag)
              break;
	}
		}
			}
			
		}//end of outer for
		System.out.println(N-count);
		
 
	}
 
    }
    

