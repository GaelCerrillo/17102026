public class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int size;

    // Recorre la lista de inicio a fin y muestra sus datos
    public void traverse() {
        // Variable de trabajo LOCAL para empezar en el primer nodo
        DoublyNode<T> current = head;

        // Recorremos hasta pasar el último nodo
        while (current != null) {
            System.out.print(current + ", ");
            // Avanzamos current al siguiente nodo
            current = current.getNext();
        }

        System.out.println();
    }