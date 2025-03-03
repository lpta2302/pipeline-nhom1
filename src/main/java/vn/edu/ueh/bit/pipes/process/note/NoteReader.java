package vn.edu.ueh.bit.pipes.process.note;

import process.IFilter;
import process.IMessage;

public class NoteReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage message) {
        message.setContent("Note processed: " + message.getContent());
        return message;
    }
}
