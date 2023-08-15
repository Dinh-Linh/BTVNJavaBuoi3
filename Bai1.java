/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

import java.util.Scanner;


public class Bai1 {
    
    public static int[] nm(int n){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n+5];
        for(int i = 0; i < n; i++){
            System.out.print("Ptu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void dem(int[] a, int n){
        int[] cnt = new int[100];
        for(int element : a){
            cnt[element]++;
        }
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] > 0){
                System.out.println("Phan tu " + i + " xuat hien " + cnt[i] + " lan.");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap slpt cua mang: ");
        int n = sc.nextInt();
        int[] a = nm(n);
        dem(a, n);
    }
}
