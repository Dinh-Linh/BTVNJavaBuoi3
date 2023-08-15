/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class Bai4 {
    
    public static boolean Ktra(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(right) != s.charAt(left)) return false;
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chuoi: ");
        String s = sc.nextLine();
        if(Ktra(s)) System.out.print("Chuoi doi xung");
        else System.out.print(" Khong phai chuoi doi xung");
    }
}

