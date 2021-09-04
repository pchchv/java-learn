package exs.stack_and_queue;

public interface Stack<T> {
    void push(T item);    // Добавление элемента на вершину стека
    T pop();              // Изъятие элемента с вершины стека
    boolean isEmpty();
}
