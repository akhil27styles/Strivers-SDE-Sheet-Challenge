package HeapImplementation;
class MaxHeap {
    private int[] heap;
    int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int item) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full.");
        }

        int i = size;
        heap[i] = item;
        size++;

        while (i != 0 && heap[i] > heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty.");
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);

        return max;
    }

    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }
}

class MinHeap {
    private int[] heap;
    int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int item) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full.");
        }

        int i = size;
        heap[i] = item;
        size++;

        while (i != 0 && heap[i] < heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty.");
        }

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);

        return min;
    }

    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }
}

public class MainHeap {
    public static void main(String[] args) {
        // Max Heap Example
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(5);
        maxHeap.insert(10);
        maxHeap.insert(3);
        maxHeap.insert(8);
        maxHeap.insert(1);

        System.out.println("Max Heap:");
        while (maxHeap.size > 0) {
            int max = maxHeap.extractMax();
            System.out.println(max);
        }

        // Min Heap Example
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(5);
        minHeap.insert(10);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        System.out.println("Min Heap:");
        while (minHeap.size > 0) {
            int min = minHeap.extractMin();
            System.out.println(min);
        }
    }
}
