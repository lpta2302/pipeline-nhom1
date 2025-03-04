package vn.edu.ueh.bit.pipes.core.entities.interfaces;

import vn.edu.ueh.bit.pipes.core.entities.InvoiceInfo;

public interface IMessage {
    InvoiceInfo getInvoiceInfo();
    void setInvoiceInfo(InvoiceInfo invoiceInfo);
    String getFileContent();
    void setFileContent(String fileContent);
}
