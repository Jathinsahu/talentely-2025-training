class queue<T> {
    T[] queue = (T[]) new Object[100];
    int front = 0;
    int rear = -1;
    int size = 0;

    public boolean isempty() {
        return size == 0;
    }

    public boolean isfull() {
        return size == queue.length;
    }

    public void enqueue(T val) {
        if (!isfull()) {
            rear = (rear + 1) % queue.length;
            queue[rear] = val;
            size++;
        } else {
            try {
                throw new RuntimeException("Exception queue is full");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public T dequeue() {
        if (!isempty()) {
            T val = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return val;
        } else {
            throw new RuntimeException("Exception queue is empty");
        }
    }

    public T at_front() {
        if (!isempty()) {
            return queue[front];
        } else {
            throw new RuntimeException("Exception queue is empty");
        }
    }

    public T at_rear() {
        if (!isempty()) {
            return queue[rear];
        } else {
            throw new RuntimeException("Exception queue is empty");
        }
    }
}
