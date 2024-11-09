package com.practice.leetcode;

public class AddTwoNumbers {
        public static void main(String[] args) {
            int[] l1 = {2, 4, 3};
            int[] l2 = {5, 6, 4};
            String a=rev(l1);
            String b=rev(l2);
            int c=Integer.parseInt(a);
            int d=Integer.parseInt(b);
            int e=c+d;
            System.out.println("Integer values of e" + e);
            int[] f=Int_to_array(e);
            String j=rev(f);
            int i=Integer.parseInt(j);

            int[] k=Int_to_array(i);
            for(int l=0;l<k.length;l++)
            {
                System.out.println(k[l]);
            }



    }
            public static String rev(int[] a)
            {
                String s="";
                for(int j = a.length-1; j <a.length && j >=0; j--){
                    s=s+a[j];
                }
                System.out.println(s);
                return s;

            }
    static int[] Int_to_array(int n)
    {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0)
        {
            arr[len-j-1] = n%10;
            n=n/10;
            j++;
        }
        return arr;
    }
}
