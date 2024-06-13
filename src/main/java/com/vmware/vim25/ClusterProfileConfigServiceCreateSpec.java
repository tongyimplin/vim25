package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileConfigServiceCreateSpec;
import com.vmware.vim25.ClusterProfileConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterProfileConfigServiceCreateSpec", propOrder = {"serviceType"})
public class ClusterProfileConfigServiceCreateSpec extends ClusterProfileConfigSpec {
  protected List<String> serviceType;
  
  public List<String> getServiceType() {
    if (this.serviceType == null)
      this.serviceType = new ArrayList<>(); 
    return this.serviceType;
  }
}
