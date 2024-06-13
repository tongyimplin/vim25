package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCryptoManagerKmipClusterStatus;
import com.vmware.vim25.CryptoManagerKmipClusterStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCryptoManagerKmipClusterStatus", propOrder = {"cryptoManagerKmipClusterStatus"})
public class ArrayOfCryptoManagerKmipClusterStatus {
  @XmlElement(name = "CryptoManagerKmipClusterStatus")
  protected List<CryptoManagerKmipClusterStatus> cryptoManagerKmipClusterStatus;
  
  public List<CryptoManagerKmipClusterStatus> getCryptoManagerKmipClusterStatus() {
    if (this.cryptoManagerKmipClusterStatus == null)
      this.cryptoManagerKmipClusterStatus = new ArrayList<>(); 
    return this.cryptoManagerKmipClusterStatus;
  }
}
