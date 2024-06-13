package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleCertificatesVerifyFaultThumbprintData", propOrder = {"port", "thumbprint"})
public class MultipleCertificatesVerifyFaultThumbprintData extends DynamicData {
  protected int port;
  
  @XmlElement(required = true)
  protected String thumbprint;
  
  public int getPort() {
    return this.port;
  }
  
  public void setPort(int paramInt) {
    this.port = paramInt;
  }
  
  public String getThumbprint() {
    return this.thumbprint;
  }
  
  public void setThumbprint(String paramString) {
    this.thumbprint = paramString;
  }
}
