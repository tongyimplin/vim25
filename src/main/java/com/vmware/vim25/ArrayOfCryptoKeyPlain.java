package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCryptoKeyPlain;
import com.vmware.vim25.CryptoKeyPlain;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCryptoKeyPlain", propOrder = {"cryptoKeyPlain"})
public class ArrayOfCryptoKeyPlain {
  @XmlElement(name = "CryptoKeyPlain")
  protected List<CryptoKeyPlain> cryptoKeyPlain;
  
  public List<CryptoKeyPlain> getCryptoKeyPlain() {
    if (this.cryptoKeyPlain == null)
      this.cryptoKeyPlain = new ArrayList<>(); 
    return this.cryptoKeyPlain;
  }
}
