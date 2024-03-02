public class EmailLogger implements Logger {
    int priority;
    public EmailLogger(int priority) {
        this.priority = priority;
    }
    Logger next ;
    public void setNext(Logger next) {
        this.next = next;
    }
    @Override
    public void writeMessage(String message, int level) {
        if(level<=priority){
            System.out.println("E-mail cooбщение: " + message);
        }
        if(next!=null){
            next.writeMessage(message,level);
        }
    }
}
