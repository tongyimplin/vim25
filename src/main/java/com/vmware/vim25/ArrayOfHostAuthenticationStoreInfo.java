package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostAuthenticationStoreInfo;
import com.vmware.vim25.HostAuthenticationStoreInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostAuthenticationStoreInfo", propOrder = {"hostAuthenticationStoreInfo"})
public class ArrayOfHostAuthenticationStoreInfo {
  @XmlElement(name = "HostAuthenticationStoreInfo")
  protected List<HostAuthenticationStoreInfo> hostAuthenticationStoreInfo;
  
  public List<HostAuthenticationStoreInfo> getHostAuthenticationStoreInfo() {
    if (this.hostAuthenticationStoreInfo == null)
      this.hostAuthenticationStoreInfo = new ArrayList<>(); 
    return this.hostAuthenticationStoreInfo;
  }
}
