package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanHostConfigInfoNetworkInfoPortConfig;
import com.vmware.vim25.VsanHostConfigInfoNetworkInfoPortConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostConfigInfoNetworkInfoPortConfig", propOrder = {"vsanHostConfigInfoNetworkInfoPortConfig"})
public class ArrayOfVsanHostConfigInfoNetworkInfoPortConfig {
  @XmlElement(name = "VsanHostConfigInfoNetworkInfoPortConfig")
  protected List<VsanHostConfigInfoNetworkInfoPortConfig> vsanHostConfigInfoNetworkInfoPortConfig;
  
  public List<VsanHostConfigInfoNetworkInfoPortConfig> getVsanHostConfigInfoNetworkInfoPortConfig() {
    if (this.vsanHostConfigInfoNetworkInfoPortConfig == null)
      this.vsanHostConfigInfoNetworkInfoPortConfig = new ArrayList<>(); 
    return this.vsanHostConfigInfoNetworkInfoPortConfig;
  }
}
