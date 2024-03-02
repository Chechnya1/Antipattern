public class FileLogger implements Logger {
    int priority;
    public FileLogger(int priority) {
        this.priority = priority;
    }
    Logger next ;
    public void setNext(Logger next) {
        this.next = next;
    }
    @Override
    public void writeMessage(String message, int level) {
        if(level<=priority){
            System.out.println("Записываем файл: " + message);
        }
        if(next!=null){
            next.writeMessage(message,level);
        }
    }
}
