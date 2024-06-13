package com.vmware.vim25;

import com.vmware.vim25.HostConnectFault;
import com.vmware.vim25.MultipleCertificatesVerifyFault;
import com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleCertificatesVerifyFault", propOrder = {"thumbprintData"})
public class MultipleCertificatesVerifyFault extends HostConnectFault {
  @XmlElement(required = true)
  protected List<MultipleCertificatesVerifyFaultThumbprintData> thumbprintData;
  
  public List<MultipleCertificatesVerifyFaultThumbprintData> getThumbprintData() {
    if (this.thumbprintData == null)
      this.thumbprintData = new ArrayList<>(); 
    return this.thumbprintData;
  }
}
