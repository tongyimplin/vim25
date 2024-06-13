package com.vmware.vim25;

import com.vmware.vim25.DownloadDescriptionTreeResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "DownloadDescriptionTreeResponse")
public class DownloadDescriptionTreeResponse {
  @XmlElement(required = true)
  protected byte[] returnval;
  
  public byte[] getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(byte[] paramArrayOfbyte) {
    this.returnval = paramArrayOfbyte;
  }
}
