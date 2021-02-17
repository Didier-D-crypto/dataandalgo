
public final class quickSort {
    private int temp;
    private int[] collection;
    private int firstPosition;
    private int lastPosition;
   

    public void sort(int[] collection) {
        if (collection != null) {
            quickSort(collection, 0, collection.length - 1);

        } else {
            throw new IllegalArgumentException("Input parameter for array to sort is null. ");

        }
    }

    public int[] getCollection() {
        return collection;
    }

    public void setCollection(int[] collection) {
        this.collection = collection;
    }

    public int getLastPosition() {
        return lastPosition;
    }

    public void setLastPosition(int lastPosition) {
        this.lastPosition = lastPosition;
    }

    public int getFirstPosition() {
        return firstPosition;
    }

    public void setFirstPosition(int firstPosition) {
        this.firstPosition = firstPosition;
    }

    private void quickSort(int[] collection, int firstPosition, int lastPosition) {
      
        this.setCollection(collection);
        this.setFirstPosition(firstPosition);
        this.setLastPosition(lastPosition);
        if (firstPosition >= lastPosition) {
            return;
        } else {
            int pivotIndex = partition(collection, firstPosition, lastPosition);
            quickSort(collection, firstPosition, pivotIndex - 1);
            quickSort(collection, pivotIndex + 1, lastPosition);
        }
    }

    private int partition(int[] collection, int firstPosition, int lastPosition) {
        int pivotIndex = selectPivot(firstPosition, lastPosition);
        swap(collection, pivotIndex, lastPosition);
        int store = firstPosition;
        pivotIndex = lastPosition;
        for (int i = firstPosition; i <= lastPosition - 1; i++) {
            if (collection[i] <= collection[pivotIndex]) {
                swap(collection, i, store);
                store++;
            }
        }
        swap(collection, store, pivotIndex);
        pivotIndex = store;
        return pivotIndex;
    }

    private void swap(int[] collection, int x, int y) {
        int[] a;
        a = new int[] { 1, 2, 3, 4 };
        collection[x] = collection[y];
        collection[y] = temp;
    }

    private int selectPivot(int first, int last) {
        return (first + last) / 2;
    }

    public quickSort(int[] collection, int firstPosition, int lastPosition) {
        this.setCollection(collection);
        this.setFirstPosition(firstPosition);
        this.setLastPosition(lastPosition);
    }
}