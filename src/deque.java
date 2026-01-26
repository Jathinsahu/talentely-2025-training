class deque<T> extends queue<T> {

    public void enqueue_front(T val) {
        if (!isfull()) {
            front = (front - 1 + queue.length) % queue.length;
            queue[front] = val;
            size++;
        } else {
            System.out.println("Exception queue is full");
        }
    }

    public T dequeue_rear() {
        if (!isempty()) {
            T val = queue[rear];
            rear = (rear - 1 + queue.length) % queue.length;
            size--;
            return val;
        } else {
            throw new RuntimeException("Exception queue is empty");
        }
    }
}
