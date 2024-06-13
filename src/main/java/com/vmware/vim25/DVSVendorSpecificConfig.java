package com.vmware.vim25;

import com.vmware.vim25.DVSVendorSpecificConfig;
import com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob;
import com.vmware.vim25.InheritablePolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSVendorSpecificConfig", propOrder = {"keyValue"})
public class DVSVendorSpecificConfig extends InheritablePolicy {
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> keyValue;
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getKeyValue() {
    if (this.keyValue == null)
      this.keyValue = new ArrayList<>(); 
    return this.keyValue;
  }
}
