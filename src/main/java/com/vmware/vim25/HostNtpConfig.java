package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNtpConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNtpConfig", propOrder = {"server", "configFile"})
public class HostNtpConfig extends DynamicData {
  protected List<String> server;
  
  protected List<String> configFile;
  
  public List<String> getServer() {
    if (this.server == null)
      this.server = new ArrayList<>(); 
    return this.server;
  }
  
  public List<String> getConfigFile() {
    if (this.configFile == null)
      this.configFile = new ArrayList<>(); 
    return this.configFile;
  }
}
