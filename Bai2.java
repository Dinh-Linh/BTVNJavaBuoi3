/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class Bai2 {
    
    public static int[] nm(int n){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n+5];
        for(int i = 0; i < n; i++){
            System.out.print("Ptu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void them(int[] a, int n, int index, int value){
        for(int i = n; i >= index; i--){
            a[i+1] = a[i];
        }
        a[index] = value;
        System.out.print("Mang vua them phan tu la: ");
        for(int i = 0; i <= n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    public static void xoa(int[] a, int n, int index){
        for(int i = index; i < n; i++){
            a[i] = a[i+1];
        }
        n--;
        System.out.print("Mang sau khi xoa phan tu la: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap slpt cua mang: ");
        int n = sc.nextInt();
        int[] a = nm(n);
        System.out.print("Nhap vtri them: ");
        int index = sc.nextInt();
        System.out.print("Nhap gia tri them");
        int value = sc.nextInt();
        them(a, n, index, value);
        System.out.print("Nhap vtri xoa: ");
        int index1 = sc.nextInt();
        xoa(a, n, index1);
    }
    
}
