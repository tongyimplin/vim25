package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualTPM;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualTPM", propOrder = {"endorsementKeyCertificateSigningRequest", "endorsementKeyCertificate"})
public class VirtualTPM extends VirtualDevice {
  protected List<byte[]> endorsementKeyCertificateSigningRequest;
  
  protected List<byte[]> endorsementKeyCertificate;
  
  public List<byte[]> getEndorsementKeyCertificateSigningRequest() {
    if (this.endorsementKeyCertificateSigningRequest == null)
      this.endorsementKeyCertificateSigningRequest = (List)new ArrayList<>(); 
    return this.endorsementKeyCertificateSigningRequest;
  }
  
  public List<byte[]> getEndorsementKeyCertificate() {
    if (this.endorsementKeyCertificate == null)
      this.endorsementKeyCertificate = (List)new ArrayList<>(); 
    return this.endorsementKeyCertificate;
  }
}
