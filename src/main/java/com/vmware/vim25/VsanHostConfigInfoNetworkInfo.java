package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostConfigInfoNetworkInfo;
import com.vmware.vim25.VsanHostConfigInfoNetworkInfoPortConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostConfigInfoNetworkInfo", propOrder = {"port"})
public class VsanHostConfigInfoNetworkInfo extends DynamicData {
  protected List<VsanHostConfigInfoNetworkInfoPortConfig> port;
  
  public List<VsanHostConfigInfoNetworkInfoPortConfig> getPort() {
    if (this.port == null)
      this.port = new ArrayList<>(); 
    return this.port;
  }
}
