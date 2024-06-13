package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostProductSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostProductSpec", propOrder = {"productLineId", "version"})
public class DistributedVirtualSwitchHostProductSpec extends DynamicData {
  protected String productLineId;
  
  protected String version;
  
  public String getProductLineId() {
    return this.productLineId;
  }
  
  public void setProductLineId(String paramString) {
    this.productLineId = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
}
