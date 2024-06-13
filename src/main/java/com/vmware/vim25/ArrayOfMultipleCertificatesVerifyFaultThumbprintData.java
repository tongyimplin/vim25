package com.vmware.vim25;

import com.vmware.vim25.ArrayOfMultipleCertificatesVerifyFaultThumbprintData;
import com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMultipleCertificatesVerifyFaultThumbprintData", propOrder = {"multipleCertificatesVerifyFaultThumbprintData"})
public class ArrayOfMultipleCertificatesVerifyFaultThumbprintData {
  @XmlElement(name = "MultipleCertificatesVerifyFaultThumbprintData")
  protected List<MultipleCertificatesVerifyFaultThumbprintData> multipleCertificatesVerifyFaultThumbprintData;
  
  public List<MultipleCertificatesVerifyFaultThumbprintData> getMultipleCertificatesVerifyFaultThumbprintData() {
    if (this.multipleCertificatesVerifyFaultThumbprintData == null)
      this.multipleCertificatesVerifyFaultThumbprintData = new ArrayList<>(); 
    return this.multipleCertificatesVerifyFaultThumbprintData;
  }
}
