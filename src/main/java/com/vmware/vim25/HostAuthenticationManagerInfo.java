package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAuthenticationManagerInfo;
import com.vmware.vim25.HostAuthenticationStoreInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAuthenticationManagerInfo", propOrder = {"authConfig"})
public class HostAuthenticationManagerInfo extends DynamicData {
  @XmlElement(required = true)
  protected List<HostAuthenticationStoreInfo> authConfig;
  
  public List<HostAuthenticationStoreInfo> getAuthConfig() {
    if (this.authConfig == null)
      this.authConfig = new ArrayList<>(); 
    return this.authConfig;
  }
}
