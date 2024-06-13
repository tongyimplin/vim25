package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.NetDhcpConfigInfoDhcpOptions;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDhcpConfigInfoDhcpOptions", propOrder = {"enable", "config"})
public class NetDhcpConfigInfoDhcpOptions extends DynamicData {
  protected boolean enable;
  
  protected List<KeyValue> config;
  
  public boolean isEnable() {
    return this.enable;
  }
  
  public void setEnable(boolean paramBoolean) {
    this.enable = paramBoolean;
  }
  
  public List<KeyValue> getConfig() {
    if (this.config == null)
      this.config = new ArrayList<>(); 
    return this.config;
  }
}
