package vn.edu.ueh.bit.pipes.process.payment;
import process.IFilter;
import process.IMessage;

public class PaymentReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage message) {
        message.setContent("Payment processed: " + message.getContent());
        return message;
    }
}
