package vn.edu.ueh.bit.pipes.pipes;

import vn.edu.ueh.bit.pipes.process.*;
import vn.edu.ueh.bit.pipes.process.credit.CreditNoteReader;
import vn.edu.ueh.bit.pipes.process.invoice.InvoiceReader;
import vn.edu.ueh.bit.pipes.process.note.NoteReader;
import vn.edu.ueh.bit.pipes.process.payment.PaymentReader;

public class PipelineMain {
    public static void main(String[] args) {
        // Khởi tạo pipeline xử lý
        ProcessPipeline pipeline = new ProcessPipeline();

        // Thêm các bộ xử lý vào pipeline
        pipeline.addFilter(new CreditNoteReader());
        pipeline.addFilter(new InvoiceReader());
        pipeline.addFilter(new NoteReader());
        pipeline.addFilter(new PaymentReader());

        // Tạo message đầu vào
        IMessage message = new Message("Dữ liệu gốc");

        // Xử lý message qua pipeline
        IMessage result = pipeline.process(message);

        // Hiển thị kết quả
        System.out.println("Kết quả sau khi xử lý: " + result.getContent());
    }
}
