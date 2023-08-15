/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class Bai3 {
    
    public static int[] nm(int n){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[n+5];
    for(int i = 0; i < n; i++){
        System.out.print("Ptu a[" + i + "]: ");
        a[i] = sc.nextInt();
    }
    return a;
}
    
    public static void xm(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void SapXep(int[] a, int n){
        int tmp;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(a[i] > a[j]){
                    tmp = a[i];
                    a[i] = a[j]; 
                    a[j] = tmp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap slpt cua mang: ");
        int n = sc.nextInt();
        int[] a = nm(n);
        SapXep(a, n);
    }
    
}
