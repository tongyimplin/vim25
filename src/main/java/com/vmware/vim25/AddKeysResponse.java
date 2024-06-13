package com.vmware.vim25;

import com.vmware.vim25.AddKeysResponse;
import com.vmware.vim25.CryptoKeyResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "AddKeysResponse")
public class AddKeysResponse {
  protected List<CryptoKeyResult> returnval;
  
  public List<CryptoKeyResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
