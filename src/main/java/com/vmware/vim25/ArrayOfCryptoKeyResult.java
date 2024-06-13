package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCryptoKeyResult;
import com.vmware.vim25.CryptoKeyResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCryptoKeyResult", propOrder = {"cryptoKeyResult"})
public class ArrayOfCryptoKeyResult {
  @XmlElement(name = "CryptoKeyResult")
  protected List<CryptoKeyResult> cryptoKeyResult;
  
  public List<CryptoKeyResult> getCryptoKeyResult() {
    if (this.cryptoKeyResult == null)
      this.cryptoKeyResult = new ArrayList<>(); 
    return this.cryptoKeyResult;
  }
}
