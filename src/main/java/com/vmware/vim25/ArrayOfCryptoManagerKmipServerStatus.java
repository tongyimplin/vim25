package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCryptoManagerKmipServerStatus;
import com.vmware.vim25.CryptoManagerKmipServerStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCryptoManagerKmipServerStatus", propOrder = {"cryptoManagerKmipServerStatus"})
public class ArrayOfCryptoManagerKmipServerStatus {
  @XmlElement(name = "CryptoManagerKmipServerStatus")
  protected List<CryptoManagerKmipServerStatus> cryptoManagerKmipServerStatus;
  
  public List<CryptoManagerKmipServerStatus> getCryptoManagerKmipServerStatus() {
    if (this.cryptoManagerKmipServerStatus == null)
      this.cryptoManagerKmipServerStatus = new ArrayList<>(); 
    return this.cryptoManagerKmipServerStatus;
  }
}
