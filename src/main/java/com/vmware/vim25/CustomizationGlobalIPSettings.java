package com.vmware.vim25;

import com.vmware.vim25.CustomizationGlobalIPSettings;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationGlobalIPSettings", propOrder = {"dnsSuffixList", "dnsServerList"})
public class CustomizationGlobalIPSettings extends DynamicData {
  protected List<String> dnsSuffixList;
  
  protected List<String> dnsServerList;
  
  public List<String> getDnsSuffixList() {
    if (this.dnsSuffixList == null)
      this.dnsSuffixList = new ArrayList<>(); 
    return this.dnsSuffixList;
  }
  
  public List<String> getDnsServerList() {
    if (this.dnsServerList == null)
      this.dnsServerList = new ArrayList<>(); 
    return this.dnsServerList;
  }
}
