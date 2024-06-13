package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDVSHealthCheckConfig;
import com.vmware.vim25.DVSHealthCheckConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDVSHealthCheckConfig", propOrder = {"dvsHealthCheckConfig"})
public class ArrayOfDVSHealthCheckConfig {
  @XmlElement(name = "DVSHealthCheckConfig")
  protected List<DVSHealthCheckConfig> dvsHealthCheckConfig;
  
  public List<DVSHealthCheckConfig> getDVSHealthCheckConfig() {
    if (this.dvsHealthCheckConfig == null)
      this.dvsHealthCheckConfig = new ArrayList<>(); 
    return this.dvsHealthCheckConfig;
  }
}
