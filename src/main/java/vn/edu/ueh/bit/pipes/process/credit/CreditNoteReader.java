package vn.edu.ueh.bit.pipes.process.credit;

import process.IFilter;
import process.IMessage;

public class CreditNoteReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage message) {
        message.setContent("Credit Note processed: " + message.getContent());
        return message;
    }
}

