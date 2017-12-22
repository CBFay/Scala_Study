// https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
// Created 12.21.2017 by CB Fay

object Solution {
    
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = new Array[Int](n);
        for(a_i <- 0 to n-1) {
            a(a_i) = sc.nextInt()
        }
        bubbleSort(n, a)
    }
    
    def bubbleSort(size: Int, arr: Array[Int]) {
        var swaps = 0
        var temp = 0
        
        for (i <- 0 to size) {
            for (j <- 0 to size-2) {
                if (arr(j) > arr(j+1)) {
                    
                    temp = arr(j)
                    arr(j) = arr(j+1)
                    arr(j+1) = temp
                    
                    swaps += 1
                }
            }
        }
        println("Array is sorted in " + swaps + " swaps.")
        println("First Element: " + arr(0))
        println("Last Element: " + arr(size-1))
    }
    
} 
