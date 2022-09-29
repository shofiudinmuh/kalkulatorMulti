/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc;

/**
 *
 * @author user
 */
public class Scientific {
    String s,a;
    double[] num=new double[500];
    String[] op=new String[500];
    String[] in=new String[500];
    int ind1,ind2,ind3,i,j,k;
    double x,y,ans,memory;
    boolean on=false;
    
    private static String dellast(String str) {
        return str.substring(0, str.length() - 1);
    }
    private int nCr(int n,int r)
    {
	if(r==0 || n==r)
            return 1;
	else
            return nCr(n-1,r)+nCr(n-1,r-1);
    }
    private int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return fact(n-1)*n;
   }
    
}
