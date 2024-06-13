package com.vmware.vim25;

import com.vmware.vim25.GetDefaultKmsClusterResponse;
import com.vmware.vim25.KeyProviderId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "GetDefaultKmsClusterResponse")
public class GetDefaultKmsClusterResponse {
  protected KeyProviderId returnval;
  
  public KeyProviderId getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(KeyProviderId paramKeyProviderId) {
    this.returnval = paramKeyProviderId;
  }
}
