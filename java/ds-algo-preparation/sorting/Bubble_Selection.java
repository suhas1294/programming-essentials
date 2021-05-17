// Bubble sort O(n^2)
for (int i = 0; i < arrayLength-1 ; i++ ) {
	for (int j = 0; i < arrayLength-i-1 ; j++) {
		if (a[j] > a[j+1]) {
			swap(a[j], a[j+1]);
		}
	}
}


// Selection sort O(n^2)
for (int i = 0; i < arrayLength-1 ; i++ ) {
	int indexOfMin = i;
	for (int j = (i+1); i < arrayLength; j++) {
		if (a[j] < a[indexOfMin]) {
			indexOfMin = j;
		}
	}
	swap(a[i], a[indexOfMin]);
}