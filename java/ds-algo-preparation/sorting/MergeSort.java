void merge(int arr[], int left, int middle, int right){
    int n1 = middle - left + 1;
    int n2 = right - middle;
    int L[] = new int [n1]; // temp array
    int R[] = new int [n2]; // temp array
    /*Copy data to temp arrays*/
    for (int i=0; i<n1; ++i)
        L[i] = arr[left + i];
    for (int j=0; j<n2; ++j)
        R[j] = arr[middle + 1+ j];
    /* Merge the temp arrays */
    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2){
        if (L[i] <= R[j]){
            arr[k] = L[i];
            i++;
        }else{
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    /* Copy remaining elements of L[] if any */
    while (i < n1){
        arr[k] = L[i];
        i++;
        k++;
    }
    /* Copy remaining elements of R[] if any */
    while (j < n2){
        arr[k] = R[j];
        j++;
        k++;
    }
}
void sort(int arr[], int left, int right){
    if (left < right){
        int middle = (left+right)/2;
        sort(arr, left, middle);
        sort(arr , middle+1, right);
        merge(arr, left, middle, right);
    }
}

