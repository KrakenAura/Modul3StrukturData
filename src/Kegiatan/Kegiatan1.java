package Kegiatan;

import java.util.*;

class Stack {
    int size;
    int top;
    char[] a;

    boolean isEmpty() {
        return (top < 0);
    }

    Stack(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char x) {
        if (top >= size) {
            System.out.println("Stack Kelebihan");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack Kurang");
            return 0;
        } else {
            char x = a[top--];
            return x;
        }
    }
}

class Main {

    public static void reverse(StringBuffer str) {
        int n = str.length();
        Stack obj = new Stack(n);

        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++) {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        System.out.println("String Anda : ");
        reverse(s.append(scan.nextLine()));

        System.out.println("Setelah dibalik : " + s);
    }
}
