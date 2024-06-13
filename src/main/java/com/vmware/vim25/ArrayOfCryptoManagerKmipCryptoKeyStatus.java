package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCryptoManagerKmipCryptoKeyStatus;
import com.vmware.vim25.CryptoManagerKmipCryptoKeyStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCryptoManagerKmipCryptoKeyStatus", propOrder = {"cryptoManagerKmipCryptoKeyStatus"})
public class ArrayOfCryptoManagerKmipCryptoKeyStatus {
  @XmlElement(name = "CryptoManagerKmipCryptoKeyStatus")
  protected List<CryptoManagerKmipCryptoKeyStatus> cryptoManagerKmipCryptoKeyStatus;
  
  public List<CryptoManagerKmipCryptoKeyStatus> getCryptoManagerKmipCryptoKeyStatus() {
    if (this.cryptoManagerKmipCryptoKeyStatus == null)
      this.cryptoManagerKmipCryptoKeyStatus = new ArrayList<>(); 
    return this.cryptoManagerKmipCryptoKeyStatus;
  }
}
