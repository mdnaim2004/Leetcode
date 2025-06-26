##include <stdio.h>

int main() {
    int n, m;
    printf("Enter a number: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for(int i = 0; i<n; i++){
        if(arr[i]>m){
            m = arr[i];
        }
    }
    printf("maximum  %d\n", m);
}