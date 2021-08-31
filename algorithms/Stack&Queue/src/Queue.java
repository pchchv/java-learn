public interface Queue<T> {
    void add(T item); // Добавление элемента в конец очереди
    T remove();       // Извлечение элемента из начала очереди

    boolean isEmpty();
}
