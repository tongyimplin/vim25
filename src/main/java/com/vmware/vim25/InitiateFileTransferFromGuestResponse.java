package com.vmware.vim25;

import com.vmware.vim25.FileTransferInformation;
import com.vmware.vim25.InitiateFileTransferFromGuestResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "InitiateFileTransferFromGuestResponse")
public class InitiateFileTransferFromGuestResponse {
  @XmlElement(required = true)
  protected FileTransferInformation returnval;
  
  public FileTransferInformation getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(FileTransferInformation paramFileTransferInformation) {
    this.returnval = paramFileTransferInformation;
  }
}
