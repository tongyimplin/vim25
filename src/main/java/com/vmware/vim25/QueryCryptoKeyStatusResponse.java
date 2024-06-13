package com.vmware.vim25;

import com.vmware.vim25.CryptoManagerKmipCryptoKeyStatus;
import com.vmware.vim25.QueryCryptoKeyStatusResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryCryptoKeyStatusResponse")
public class QueryCryptoKeyStatusResponse {
  protected List<CryptoManagerKmipCryptoKeyStatus> returnval;
  
  public List<CryptoManagerKmipCryptoKeyStatus> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
