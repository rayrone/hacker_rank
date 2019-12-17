/*
    Printing Pattern using Loops
    URL: https://www.hackerrank.com/challenges/printing-pattern-2/
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int n;

    scanf("%d", &n);

    int num_p = n;
    int qtd_lin_col = n * 2 - 1;
    int colp_1 = 1, colp_2 = qtd_lin_col;

    for (int i = 1 ; i <= qtd_lin_col ; i++) {

        int num_a = n;

        for (int j = 1 ; j <= qtd_lin_col ; j++) {

            if(j >= colp_1 && j <= colp_2) {
                printf("%d ", num_p);
                num_a = num_p + 1;
            } else {
                printf("%d ", num_a);

                if(j < colp_1)
                    num_a--;
                else if(j > colp_2)
                    num_a++;
            }
        }

        if(i < n) {
            colp_1++;
            colp_2--;
            num_p--;
        } else {
            colp_1--;
            colp_2++;
            num_p++;
        }

        printf("\n");
    }

    return 0;
}
