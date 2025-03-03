package vn.edu.ueh.bit.pipes.process.invoice;

import process.IFilter;
import process.IMessage;

public class InvoiceReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage message) {
        message.setContent("Invoice processed: " + message.getContent());
        return message;
    }
}
