package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCryptoKeyId;
import com.vmware.vim25.CryptoKeyId;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCryptoKeyId", propOrder = {"cryptoKeyId"})
public class ArrayOfCryptoKeyId {
  @XmlElement(name = "CryptoKeyId")
  protected List<CryptoKeyId> cryptoKeyId;
  
  public List<CryptoKeyId> getCryptoKeyId() {
    if (this.cryptoKeyId == null)
      this.cryptoKeyId = new ArrayList<>(); 
    return this.cryptoKeyId;
  }
}
