package vn.edu.ueh.bit.pipes.process;

public class Message implements IMessage {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" + "content='" + content + '\'' + '}';
    }
}
