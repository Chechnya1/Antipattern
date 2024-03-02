public class ChainApp {
public static void main(String[] args){
    SMSLogger logger0 =  new SMSLogger(Level.ERROR);
    FileLogger logger1 =  new FileLogger(Level.DEBUG);
    EmailLogger logger2 =  new EmailLogger(Level.INFO);
    USB usb = new USB();
    // USB connected in claviatura
    logger0.setNext(logger1);
    logger1.setNext(logger2);
    logger0.writeMessage("УРАААА", Level.ERROR);
    logger0.writeMessage("lalalala", Level.DEBUG);
    logger0.writeMessage("helpysos", Level.INFO);

}
}


